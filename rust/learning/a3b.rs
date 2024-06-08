// Topic: Flow control using if..else if..else
//
// Program requirements:
// * Display ">5", "<5", or "=5" based on the value of a variable
//   is > 5, < 5, or == 5, respectively
//
// Notes:
fn is_able(candies: i32) {
    if candies > 5 {
        println!("you have more than 5 candies");
    } else if candies < 5 {
        println!("you have less than 5 candies");
    } else {
        println!("you have exactly 5 candies");
    }
}

// * Use a variable set to any integer value
// * Use an if..elsr if..else block to determine which message to display
// * Use the println macro to display messages to the terminal

fn main() {
    is_able(3);
}
