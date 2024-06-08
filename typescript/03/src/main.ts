let stringArr = ["one", "hey", "aharoJ"];

let teams = ["real", "chivas", "america", 69];

let mixedData = ["evh", 1984, true];

stringArr[0] = "hehe";
stringArr.push("lala");

teams[0] = 1969;
teams.push("quak");

let test = [];

let bands: string[] = [];

let tuple: [string, number, boolean] = ["haro", 14, false];









let obj: object;
obj = [];
console.log(typeof obj);
obj = teams;

const exampleObj = {
  prop1: "aharoJ",
  prop2: true,
};

exampleObj.prop2 = false;

type Team = {
  name: string;
  active?: boolean;
  teams: (string | number)[];
};

let realMadrid: Team = {
  name: "madrid",
  active: true,
  teams: [22, "dubs"],
};
let chivas: Team = {
  name: "chivita",
  active: true,
  teams: [11, "W"],
};
