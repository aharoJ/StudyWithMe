// Topic: Working with an enum
//
// Program requirements:
// * Prints the name of a color to the terminal
//
// Notes:
// * Use an enum with color names as variants
// * Use a function to print the color name
// * The function must use the enum as a parameter
// * Use a match expression to determine which color
//   name to print

enum COLORS {
    Red,
    Blue,
}

fn print_color(choose: COLORS) {
    // LOCAL
    // let choose = COLORS::Red;
    match choose {
        COLORS::Red => println!("Color: Red"),
        COLORS::Blue => println!("Color: Blue"),
    }
}

fn main() {
    let select=COLORS::Blue;
    print_color(select);
}
