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
  public readonly name: string;
  public music: string;
  private age: number;
  protected lang: string;

  constructor(name: string, music: string, age: number, lang: string) {
    this.name = name;
    this.music = music;
    this.age = age;
    this.lang = lang;
  }

  public getAge() {
    return `You are: ${this.age}`;
  }
}

const Angel = new Coder("Yare", "Lofi", 24, "Spanish");
console.log(Angel);

class WebDev extends Coder {
  public computer: string;

  constructor(computer: string, name: string, music: string, age: number) {
    super(name, music, age, "");
    this.computer = computer;
  }
  public getLang() {
    return `I understand ${this.lang}`;
  }
}

const Sara = new WebDev("Mac", "Sara", "Lofi", 25);

console.log(Sara);

///////////////////////////////////////////////////////////

interface Musician {
  name: string; // prop
  instrument: string; // prop
  play(action: string): string; // method
}

class Guitarist implements Musician {
  name: string;
  instrument: string;

  constructor(name: string, instrument: string) {
    this.name = name;
    this.instrument = instrument;
  }

  play(action: string): string {
    return `${this.name} ${action} is playing ${this.instrument} `;
  }
}

console.log(new Guitarist("John", "Guitar").play("🎸"));
