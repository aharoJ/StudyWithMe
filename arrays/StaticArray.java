package arrays;

import java.util.Random;

public class StaticArray {
   private int[] array;
   public StaticArray(){}
   public StaticArray(int size){
      this.array= new int[size];
   }

   public void traverse(){
      for ( int i=0; i< array.length; ++i) {
         System.out.print(array[i] + " ");
      }
      System.out.println();
   }

   public int searchByValue(int value) {
      for (int i=0; i< array.length; ++i){
         if (array[i] == value){
            return i;
         }
      }
      return -1;
   }

   public void update(int index, int value){
      if (index >= 0 && index < array.length){
         array[index] = value;
      } else {
         System.out.println("Index out of bounds!");
      }
   }

   public void display(){
      for (int value: array){
         System.out.print(value + " ");
      }
      System.out.println();
   }

   public void fillWithRandomValues() {
    Random rand = new Random(); // instance of random class
    for (int i = 0; i < array.length; ++i) {
        array[i] = rand.nextInt(100); // assuming you want random numbers between 0 to 99
    }
}
   
}