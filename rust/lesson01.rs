fn first() {
    let x: i32 = 5;
    let _y: i32;

    assert_eq!(x, 5);
    print!("Success");
}
// ------------------------------------------------------------------

fn second() {
    let mut x: i32 = 1;
    x += 2;

    assert_eq!(x, 3);
    println!("Sucess");
}
// ------------------------------------------------------------------

fn third() {
    let x: i32 = 10;
    {
        let y: i32 = 5;
        println!("The value of x is {} and value of y is {}", x, y);
    }
    println!("The value of x is {} and value of y is ", x);
}
// ------------------------------------------------------------------

fn define_x() {
    let x: &str = "hello";
    println!("{}, world", x);
}

fn fourth() {
    define_x();
}
// --------------------------------------------------

fn fifth() {
    let x: i32 = 5;
    {
        let x: i32 = 12;
        assert_eq!(x, 12);
    }
    assert_eq!(x, 5);

    let x = 42;
    print!("{}", x);
}
// --------------------------------------------------

fn sixth() {
    let mut x: i32 = 1;
    x = 7;
    x += 3;

    let y: i32 = 4;
    // Shadowing
    let y: &str = "I can also be bound to text!";

    println!("Success!");
}
// --------------------------------------------------

fn seventh() {
    let _x: i32 = 1;
    // print!("{}", x);
}
// --------------------------------------------------

fn eight() {
    let (mut x, y) = (1, 2);
    x += 2;

    assert_eq!(x, 3);
    assert_eq!(y, 2);
    println!("Sucess");
}

fn nine() {
    let (x, y);
    // let x;
    // let y;

    (x, ..) = (3, 4);
    [.., y] = [1, 2];
    // Fill the blank to make the code work
    assert_eq!([x, y], [3, 2]);

    println!("Success!");
}



fn main() {
    // first();
    // second();
    // third();
    // fourth();
    // fifth();
    // sixth();
    // seventh();
    // eight();
}
