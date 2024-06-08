type stringOrNumber = string | number;

type stringOrNumberArray = (string | number)[];

type Guitarist = {
  name: string;
  active?: boolean;
  albums: stringOrNumberArray;
};

type UserId = stringOrNumber;

// literal types
let myName: "aharoJ";
// myName="hehe" // cant do this

let userName: "hehe" | "lala" | "sa";
userName = "hehe";

// functions
const add = (a: number, b: number): number => {
  return a + b;
};

// defaults to void
const logMsg = (message: any): void => {
  console.log(message);
};

logMsg("hello");
logMsg(23);
// add func
console.log(add(2, 4)); // output: 6

let subtract = function (a: number, b: number): number {
  return a - b;
};
console.log(subtract(12, 2)); // output: 10

// type mathFunction = (a: number, b: number) => number;
// VS
interface mathFunction {
  (a: number, b: number): number;
}

const useMathFuc: mathFunction = (a, b) => {
  return a + b;
};

logMsg(useMathFuc(2, 2));

const addAll = (a: number, b: number, c?: number): number => {
  if (typeof c !== "undefined") {
    return a + b + c;
  }
  return a + b;
};

logMsg(addAll(3, 3, 3));

// Rest Parameters
const total = (...nums: number[]): number => {
  return nums.reduce((prev, curr) => prev + curr);
};

// const total = (a:number, ...nums: number[]): number => {
//   return nums.reduce((prev, curr) => prev + curr);
// };

logMsg(total(1, 2, 3, 4, 5, 6, 7, 8));

const createError = (errMsg: string) => {
  throw new Error(errMsg);
};

// never prints
const infinite = () => {
  let i: number = 1;
  while (true) {
    i++;
  }
};

console.log(infinite);

const numOrStr = (value: number | string) => {
  if (typeof value === "number") {
    return 69;
  } else {
    return "hello";
  }
};

console.log(numOrStr("z")); 
