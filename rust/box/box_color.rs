pub enum BoxColor {
    Red,
    Blue,
}

impl BoxColor {
    pub fn print_box_color(&self) {
        match self {
            BoxColor::Red => println!("Red box selected"),
            BoxColor::Blue => println!("Blue box selected"),
        }
    }
}
