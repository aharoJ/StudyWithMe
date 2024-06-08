"use strict";
// literal types
let myName;
// myName="hehe" // cant do this
let userName;
userName = "hehe";
// functions
const add = (a, b) => {
    return a + b;
};
// defaults to void
const logMsg = (message) => {
    console.log(message);
};
logMsg("hello");
logMsg(23);
// add func
console.log(add(2, 4)); // output: 6
let subtract = function (a, b) {
    return a - b;
};
console.log(subtract(12, 2)); // output: 10
const useMathFuc = (a, b) => {
    return a + b;
};
logMsg(useMathFuc(2, 2));
const addAll = (a, b, c) => {
    if (typeof c !== "undefined") {
        return a + b + c;
    }
    return a + b;
};
logMsg(addAll(3, 3, 3));
// Rest Parameters
const total = (...nums) => {
    return nums.reduce((prev, curr) => prev + curr);
};
// const total = (a:number, ...nums: number[]): number => {
//   return nums.reduce((prev, curr) => prev + curr);
// };
logMsg(total(1, 2, 3, 4, 5, 6, 7, 8));
const createError = (errMsg) => {
    throw new Error(errMsg);
};
// never prints
const infinite = () => {
    let i = 1;
    while (true) {
        i++;
    }
};
console.log(infinite);
const numOrStr = (value) => {
    if (typeof value === "number") {
        return 69;
    }
    else {
        return "hello";
    }
};
console.log(numOrStr("z"));
