// Topic: Implementing functionality with the impl keyword
//
// Requirements:
// * Print the characteristics of a shipping box
// * Must include dimensions, weight, and color
//
// Notes:
// * Use a struct to encapsulate the box characteristics
// * Use an enum for the box color
// * Implement functionality on the box struct to create a new box
// * Implement functionality on the box struct to print the characteristics

enum BoxColor {
    Red,
    Blue,
}

impl BoxColor {
    fn print_box_color(&self) {
        match self {
            BoxColor::Red => println!("Red box selected"),
            BoxColor::Blue => println!("Blue box selected"),
        }
    }
}

struct Dimensions {
    width: f64,
    height: f64,
    depth: f64,
}

impl Dimensions {
    fn print_box_dimension(&self) {
        println!("width: {:?}", self.width);
        println!("height: {:?}", self.height);
        println!("depth: {:?}", self.depth);
    }
}

struct ShippingBox {
    color: BoxColor,
    dimensions: Dimensions,
    weight: f64,
}

impl ShippingBox {
    fn new(weight: f64, color: BoxColor, dimensions: Dimensions) -> Self {
        Self {
            weight,
            color,
            dimensions,
        }
    }

    fn print_shipping_box(&self) {
        self.color.print_box_color();
        self.dimensions.print_box_dimension();
        println!("weight: {:?}", self.weight);
    }
}

fn main() {
    let small_dimensions = Dimensions {
        width: 1.0,
        height: 2.0,
        depth: 3.0,
    };

    let small_box = ShippingBox::new(5.0, BoxColor::Red, small_dimensions);
    small_box.print_shipping_box();
}
