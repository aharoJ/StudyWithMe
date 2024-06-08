import Nav from "./Nav";
import useCart from "../hooks/useCart";

type PropsTypeclassName = {
  viewCart: boolean;
  setViewCart: React.Dispatch<React.SetStateAction<boolean>>;
};

const Header = ({ viewCart, setViewCart }: PropsType) => {
  const {totalItems, totalPrice}= useCart()
  const content = (
    <header className="header">
      <div className="header__title-bar">
        <h1>
          Acme Co.
          <div className="header__price-box">
            <p> total Items: {totalItems}</p>
            <p> total Price: {totalPrice}</p>
          </div>
        </h1>
      </div>
      <Nav viewCart={viewCart} setViewCart={setViewCart}/>
    </header>
  );

  return content
};

export default Header;
