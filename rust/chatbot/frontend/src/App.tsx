import React from "react";
import NamePrompt from "./UserModal";

type Message = {
  name: string;
  uid: number;
  message: string;
};

function App() {
  const [message, setMessage] = React.useState<string>("");
  const [name, setName] = React.useState<string>("");
  const [vis, setVis] = React.useState<boolean>(true);

  const websocket = React.useRef<WebSocket | null>(null);

  React.useEffect(() => {
    websocket.current = new WebSocket("ws://localhost:8000/ws");

    websocket.current.onopen = () => {
      console.log("Connected");
    };

    websocket.current.onclose = () => {
      console.log("Disconnected");
    };

    websocket.current.onmessage = (ev) => {
      const data: Message = JSON.parse(ev.data);
      createMessage(data);
    };

    return () => {
      websocket.current?.close();
    };
  }, []);

  const sendMessage = (
    e: React.FormEvent<HTMLFormElement>,
    name: string,
    message: string,
    setMessage: React.Dispatch<React.SetStateAction<string>>,
  ) => {
    e.preventDefault();
    if (message === "" || !websocket.current) return;
    websocket.current.send(JSON.stringify({ name, message }));
    setMessage("");
  };

  const messageClasses =
    "mx-8 break-all chat-message bg-slate-600 rounded-xl w-fit max-w-screen rounded-xl px-5 py-4".split(
      " ",
    );
  const usernameCssClasses = "text-gray-200 text-sm".split(" ");

  const createMessage = (data: Message) => {
    const messageContainer = document.createElement("div");
    messageContainer.classList.add(...messageClasses);

    const chatbox = document.querySelector("#chatbox");

    const username = document.createElement("span");
    username.classList.add(...usernameCssClasses);
    username.innerText = `${data.name}`;
    messageContainer.append(username);

    const message = document.createElement("p");
    message.innerText = `${data.message}`;
    messageContainer.append(message);

    chatbox?.append(messageContainer);
    window.scrollTo(0, document.body.scrollHeight);
  };

  return (
    <>
      <NamePrompt vis={vis} name={name} setName={setName} setVis={setVis} />
      <div className="flex flex-row text-gray-100">
        <div className="w-full bg-slate-700 flex flex-col pb-5">
          <div
            className="w-full min-h-screen flex flex-col justify-end gap-4 pb-20"
            id="chatbox"
          >
            <div className="mx-8 break-all chat-message bg-slate-600 rounded-xl w-fit px-5 py-4">
              <p>Hi! Welcome to Rustcord. Enjoy your stay!</p>
            </div>
          </div>
          <form
            className="w-full h-10 fixed bottom-0 flex flex-row justify-center gap-4 mb-5 px-5"
            onSubmit={(e) => sendMessage(e, name, message, setMessage)}
          >
            <input
              name="message"
              id="messageBox"
              type="text"
              className="bg-slate-400 w-full py-2 px-5 focus:outline-0 rounded-tl-xl rounded-bl-xl"
              value={message}
              placeholder="Enter your message here..."
              onInput={(e: React.ChangeEvent<HTMLInputElement>) =>
                setMessage(e.target.value)
              }
            />
            <button
              id="messageBtn"
              className="bg-slate-400 px-2 active:translate-y-0.5 active:translate-x-0.5 hover:text-black transition-all rounded-tr-xl rounded-br-xl"
            >
              Send Message
            </button>
          </form>
        </div>
      </div>
    </>
  );
}

export default App;
