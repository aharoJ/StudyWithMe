mod box_color;
mod dimensions;
mod shipping_box;

use box_color::BoxColor;
use dimensions::Dimensions;
use shipping_box::ShippingBox;

fn main() {
    let small_dimensions = Dimensions {
        width: 1.0,
        height: 2.0,
        depth: 3.0,
    };

    let small_box = ShippingBox::new(5.0, BoxColor::Red, small_dimensions);
    small_box.print_shipping_box();
}
