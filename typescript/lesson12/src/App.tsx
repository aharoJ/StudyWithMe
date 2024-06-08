import Heading from "./components/heading";
import { Section } from "./components/Section";
import Counter from "./components/Counter";
import { useState } from "react";
import { List } from "./components/List";

function App() {
  const [count, setCount] = useState<number>(0);
  return (
    <>
      <Heading title="hellooo" />
      <Heading title={"lal"} />
      <Section>This is my Section. </Section>
      <Counter setCount={setCount}> Count is {count}</Counter>
      <List
        items={["Yare", "Litzy", "Jose"]}
        render={(val: string) => {
          return <span className="bold">{val}</span>;
        }}
      />
    </>
  );
}

export default App;

// items={["a", "b", "c"]}
// render={(item: string) => <span className="gold">{item}</span>}
