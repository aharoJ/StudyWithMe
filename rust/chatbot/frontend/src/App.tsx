import React, { SetStateAction } from "react";

type Message = {
  name: string;
  uid: number;
  message: string;
};

const App = () => {
  const [message, setMessgae] = React.useState<string>("");
  const [name, setName] = React.useState<string>("");
  const [vis, setVis] = React.useState<boolean>(true);
  return (
    <>
      <div className="flex flex-row text-gray-100">
        <div className="w-full bg-slate-700 flex flex-col pb-5">
          <div
            className="w-full min-h-screen flex flex-col justify-end gap-4 pb-20"
            id="chatbox"
          >
            <p> Hi! Lets get MF rustyyy</p>
          </div>
        </div>
        <form
          className="w-full h-10 fixed bottom-0 flex flex-row justify-center gap-4 mb-5 mx-5 "
          onSubmit={(e) => sendMessage(e, name, message, setMessgae)}
        >
          <input
            name="messgae"
            id="messageBox"
            type="text"
            className="bg-slate-400 w-full py-2 px-5 focus:outline-0 rounded-tl-xl rounded-bl-xl"
            value={message}
            placeholder="Enter your message here..."
            onInput={(e: React.ChangeEvent<HTMLInputElement>) =>
              setMessgae(e.target.value)
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
    </>
  );
};

export default App;
