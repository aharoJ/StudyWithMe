/**
 * DynamicStack
 */
public class DynamicStack extends CustomStack {
  public DynamicStack() {
    super(); // it will call DVC of CustomStack
  }

  public DynamicStack(int size) {
    super(size); // it will call EVC of CustomStack
  }

  @Override
  public boolean push(int item) {
    if (this.isFull()) {
      int[] temp = new int[data.length * 2];
      // copy the data from old array to new array
      for (int i = 0; i < data.length; ++i) {
        temp[i] = data[i];
      }
      // update the data reference to new array
      data = temp;
    }
    // call the push method of parent class
    return super.push(item);
  }
}
