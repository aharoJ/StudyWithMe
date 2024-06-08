// Topic: Basic arithmetic
//
// Program requirements:
// * Displays the result of the sum of two numbers
//
// Notes:
// * Use a function to add two numbers together
fn add_two_numbers(a:i32, b:i32)-> i32{
    a+b
}
// * Use a function to display the result
fn display(result:i32){
    print!("{:?}", result);
}

fn main() {
    let res= add_two_numbers(2,9);
    display(res);
}
