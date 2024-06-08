// Topic: Ownership
//
// Requirements:
// * Print out the quantity and id number of a grocery item
//
// Notes:
// * Use a struct for the grocery item
// * Use two i32 fields for the quantity and id number
// * Create a function to display the quantity, with the struct as a parameter
// * Create a function to display the id number, with the struct as a parameter

struct GroceryItems {
    quantity: i32,
    id: i32,
}

fn print_quantity(item: &GroceryItems) {
    println!("items quantity: {:?}", item.quantity);
}

fn print_id(item: &GroceryItems) {
    println!("items id: {:?}", item.id);
}

fn main() {
    let temp = GroceryItems {
        quantity: 69,
        id: 3,
    };

    print_quantity(&temp);
    print_id(&temp);
}
