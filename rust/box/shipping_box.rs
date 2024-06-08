use crate::box_color::BoxColor;
use crate::dimensions::Dimensions;

pub struct ShippingBox {
    pub color: BoxColor,
    pub dimensions: Dimensions,
    pub weight: f64,
}

impl ShippingBox {
    pub fn new(weight: f64, color: BoxColor, dimensions: Dimensions) -> Self {
        Self {
            weight,
            color,
            dimensions,
        }
    }

    pub fn print_shipping_box(&self) {
        self.color.print_box_color();
        self.dimensions.print_box_dimension();
        println!("weight: {:?}", self.weight);
    }
}
