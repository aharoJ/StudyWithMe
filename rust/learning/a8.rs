// Topic: Organizing similar data using structs
//
// Requirements:
// * Print the flavor of a drink and it's fluid ounces
//
// Notes:
// * Use an enum to create different flavors of drinks
// * Use a struct to store drink flavor and fluid ounce information
// * Use a function to print out the drink flavor and ounces
// * Use a match expression to print the drink flavor

enum Sodas {
    Coke,
    Sprite,
}

enum Snacks {
    Gummies,
    PopCorn,
}

struct Order {
    soda: Sodas,
    oz: f64,
    snack: Snacks,
}

fn place_order(selection: Order) {
    match selection.soda {
        Sodas::Coke => println!("Coke, {:?}", selection.oz),
        Sodas::Sprite => println!("Sprite, {:?}", selection.oz),
    }

    match selection.snack {
        Snacks::Gummies => println!("Gummies"),
        Snacks::PopCorn => println!("PopCorn"),
    }
}

fn main() {
    let temp = Order {
        soda: Sodas::Coke,
        oz: 12.0,
        snack: Snacks::Gummies,
    };

    place_order(temp);
}
