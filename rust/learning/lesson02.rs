use std::u8;

fn first() {
    let x: i32 = 5;
    let mut _y: i32 = 5;

    _y = x;

    let _z: i32 = 10; // Type of z?

    println!("First");
}
// ------------------------------------------------------------------

fn second() {
    let _v: u16 = 38_08 as u16;
    println!("Second");
}
// ------------------------------------------------------------------

// Modify `assert_eq!` to make it work
fn third() {
    let x: u32 = 5;
    assert_eq!("u32".to_string(), type_of(&x));

    println!("Third!");
}

// Get the type of given variable, return a string representation of the type , e.g.
// type_of(&3) -> "i32"
fn type_of<T>(_: &T) -> String {
    format!("{}", std::any::type_name::<T>()) //u32
}
// ------------------------------------------------------------------

// Fill the blanks to make it work
fn fourth() {
    assert_eq!(i8::MAX, 127);
    assert_eq!(u8::MAX, 255);

    println!("Fourth!");
}
// ------------------------------------------------------------------

// Fix errors and panics to make it work
fn fifth() {
    let v1: u16 = 251 + 8;
    let v2: i16 = i16::checked_add(251, 8).unwrap();
    println!("{},{} :: FITH!", v1, v2);
}

fn sixth() {
    /*
    1024  + 255  + 63    + 255
    1_024 + 0xff + 0o77 + 0b1111_1111;
    Dec  | Hex  |  Oct |  Binary
    */
    let v = 1_024 + 0xff + 0o77 + 0b1111_1111; // 1024 + 255 + 63 + 255
    assert!(v == 1597);

    println!("SIXTH!");
}

// fn seven() {
//     let x: f64 = 1_000_000.1; // f64
//     let _y: f32 = 0.12; // f32
//     let _z: f64 = 0.01_f64; // f64
//
//     assert_eq!(type_of(&x), "f64".to_string());
//     println!("Success!");
// }
//
// fn type_of<T>(_: &T) -> String {
//     format!("{}", std::any::type_name::<T>())
// }

fn eighth() {
    assert!(0.1_f32 + 0.2_f32 == 0.3_f32);
    // assert!(0.1 as f32 + 0.2 as f32 == 0.3 as f32);
    println!("EIGHTH!");
}



fn nineth() {
    let mut sum:i32 = 0;
    for i in -3..2 {
        sum += i
    }

    assert!(sum == -5);

    for c in 'a'..='z' {
        println!("{}", c as u8); //  Unassigned is decemic value of the character
    }
}


// Fill the blanks
use std::ops::{Range, RangeInclusive};
fn tenth() {
    assert_eq!((1..5), Range { start: 1, end: 5 });
    assert_eq!((1..=5), RangeInclusive::new(1, 5));

    println!("TenTH!");
}


// Fill the blanks and fix the errors
fn eleventh() {

    assert!(1u32 + 2u32 == 3u32);

    assert!(1i32 - 2i32 == -1i32);
    
    assert!(1i8 - 2i8 == -1i8);

    assert!(3 * 50 == 150); // i32

}



fn main() {
    first();
    second();
    third();
    fourth();
    fifth();
    sixth();
    eighth();
    nineth();
    tenth();
    eleventh();
}
