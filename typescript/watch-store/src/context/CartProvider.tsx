import { ReactElement, createContext, useMemo, useReducer } from "react";

// model
export type CartItemType = {
  sku: string;
  name: string;
  price: number;
  qty: number;
};

// state
type CartStateType = {
  cart: CartItemType[];
};

// initial state
const initCartState: CartStateType = { cart: [] };

const REDUCER_ACTION_TYPE = {
  ADD: "ADD",
  REMOVE: "REMOVE",
  QUANTITY: "QUANTITY",
  SUBMIT: "SUBMIT",
};

export type ReducerActionType = typeof REDUCER_ACTION_TYPE;

export type ReducerAction = {
  type: string;
  payload?: CartItemType;
};

const reducer = (
  state: CartStateType,
  action: ReducerAction,
): CartStateType => {
  switch (action.type) {
    case REDUCER_ACTION_TYPE.ADD: {
      if (!action.payload) {
        throw new Error("action.payload is required for ADD action");
      }

      const { sku, name, price } = action.payload;
      const filterCart: CartItemType[] = state.cart.filter(
        (item) => item.sku !== sku,
      );

      const itemExist: CartItemType | undefined = state.cart.find(
        (item) => item.sku === sku,
      );

      const qty: number = itemExist ? itemExist.qty + 1 : 1;

      return { ...state, cart: [...filterCart, { sku, name, price, qty }] };
    }

    case REDUCER_ACTION_TYPE.REMOVE: {
      if (!action.payload) {
        throw new Error("action.payload is required for REMOVE action");
      }
      const { sku } = action.payload;

      const filterCart: CartItemType[] = state.cart.filter(
        (item) => item.sku !== sku,
      );

      return { ...state, cart: [...filterCart] };
    }

    case REDUCER_ACTION_TYPE.QUANTITY: {
      if (!action.payload) {
        throw new Error("action.payload is required for QUANTITY action");
      }
      const { sku, qty } = action.payload;

      const itemExist: CartItemType | undefined = state.cart.find(
        (item) => item.sku === sku,
      );

      if (!itemExist) {
        throw new Error("Item must exist in order to update quantity");
      }

      const updatedItem: CartItemType = { ...itemExist, qty };

      const filterCart: CartItemType[] = state.cart.filter(
        (item) => item.sku !== sku,
      );

      return { ...state, cart: [...filterCart, updatedItem] };
    }

    case REDUCER_ACTION_TYPE.SUBMIT: {
      return { ...state, cart: [] };
    }

    default:
      throw new Error("Unknown reducer action type");
  }
};

const useCartContext = (initCartState: CartStateType) => {
  const [state, dispatch] = useReducer(reducer, initCartState);

  const REDUCER_ACTIONS = useMemo(() => {
    return REDUCER_ACTION_TYPE;
  }, []);

  const totalItems = state.cart.reduce((prevVal, cartItem) => {
    return prevVal + cartItem.qty;
  }, 0);

  const totalPrice = new Intl.NumberFormat("en-US", {
    style: "currency",
    currency: "USD",
  }).format(
    state.cart.reduce((prevVal, cartItem) => {
      return prevVal + cartItem.price * cartItem.qty;
    }, 0),
  );

  const cart = state.cart.sort((a, b) => {
    const itemA = Number(a.sku.slice(-4));
    const itemB = Number(b.sku.slice(-4));
    return itemA - itemB;
  });

  return { dispatch, REDUCER_ACTIONS, totalItems, totalPrice, cart };
};

export type UseCartContexType = ReturnType<typeof useCartContext>;

const initCartContextState: UseCartContexType = {
  dispatch: () => { },
  REDUCER_ACTIONS: REDUCER_ACTION_TYPE,
  totalItems: 0,
  totalPrice: "",
  cart: [],
};

export const CartContext =
  createContext<UseCartContexType>(initCartContextState);

type ChildrenType = { children?: ReactElement | ReactElement[] };

export const CartProvider = ({ children }: ChildrenType): ReactElement => {
  return (
    <CartContext.Provider value={useCartContext(initCartState)}>
      {children}
    </CartContext.Provider>
  );
};

export default CartContext
