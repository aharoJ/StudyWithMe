package Stack;

import java.util.Stack;

public class ReverseString {
    public String reverseString(String word){
        Stack<Character> stack= new Stack<>();
        for (char val: word.toCharArray()){
            stack.push(val);
        }
        
        char[] array= new char[word.length()];
        for (int i=0; i< word.length(); ++i)
        {
            array[i]= stack.pop();
        }
        return new String(array);
    }


    public static void main(String[] args) {
        ReverseString sol= new ReverseString();
        System.out.println(sol.reverseString("ABCD"));



    }
}
