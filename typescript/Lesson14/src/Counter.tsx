import React, { useReducer, ChangeEvent } from "react";

interface CounterProps {
  num: number;
}

const initState = { count: 0, text: "" };

enum REDUCER_ACTION_TYPE {
  INCREMENT,
  DECREMENT,
  NEW_INPUT,
}

type ReducerAction = {
  type: REDUCER_ACTION_TYPE;
  payload?: string;
};

const reducer = (
  state: typeof initState,
  action: ReducerAction,
): typeof initState => {
  switch (action.type) {
    case REDUCER_ACTION_TYPE.INCREMENT:
      return { ...state, count: state.count + 1 };
    case REDUCER_ACTION_TYPE.DECREMENT:
      return { ...state, count: state.count - 1 };
    case REDUCER_ACTION_TYPE.NEW_INPUT:
      return { ...state, text: action.payload ?? "" };
    default:
      throw new Error("Unsupported action type");
  }
};

const incrementAction = (): ReducerAction => ({
  type: REDUCER_ACTION_TYPE.INCREMENT,
});

const decrementAction = (): ReducerAction => ({
  type: REDUCER_ACTION_TYPE.DECREMENT,
});

const newInputAction = (value: string): ReducerAction => ({
  type: REDUCER_ACTION_TYPE.NEW_INPUT,
  payload: value,
});

const Counter: React.FC<CounterProps> = ({ num }) => {
  const [state, dispatch] = useReducer(reducer, { ...initState, count: num });

  const handleIncrement = () => {
    dispatch(incrementAction());
  };

  const handleDecrement = () => {
    dispatch(decrementAction());
  };

  const handleTextInput = (e: ChangeEvent<HTMLInputElement>) => {
    dispatch(newInputAction(e.target.value));
  };

  return (
    <>
      <h1>counter at: {state.count}</h1>
      <button onClick={handleIncrement}>INCREMENT</button>
      <button onClick={handleDecrement}>DECREMENT</button>
      <input type="text" onChange={handleTextInput} value={state.text} />
      <h2>{state.text}</h2>
    </>
  );
};

export default Counter;
