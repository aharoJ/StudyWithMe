"use strict";
/**
class Coder {
  name: string;
  music: string;
  age: number;
  lang: string;

  constructor(name: string, music: string, age: number, lang: string) {
    this.name = name;
    this.music = music;
    this.age = age;
    this.lang = lang;
  }
}
*/
class Coder {
    constructor(name, music, age, lang) {
        this.name = name;
        this.music = music;
        this.age = age;
        this.lang = lang;
    }
    getAge() {
        return `You are: ${this.age}`;
    }
}
const Angel = new Coder("Yare", "Lofi", 24, "Spanish");
console.log(Angel);
class WebDev extends Coder {
    constructor(computer, name, music, age) {
        super(name, music, age, "");
        this.computer = computer;
    }
    getLang() {
        return `I understand ${this.lang}`;
    }
}
const Sara = new WebDev("Mac", "Sara", "Lofi", 25);
console.log(Sara);
class Guitarist {
    constructor(name, instrument) {
        this.name = name;
        this.instrument = instrument;
    }
    play(action) {
        return `${this.name} ${action} is playing ${this.instrument} `;
    }
}
console.log(new Guitarist("John", "Guitar").play("🎸"));
