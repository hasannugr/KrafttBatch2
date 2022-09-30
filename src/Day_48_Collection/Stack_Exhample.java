package Day_48_Collection;

import java.util.Stack;

public class Stack_Exhample {


    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.add(true);
        stack.add(5);
        stack.add("Merhaba");
        stack.add('C');
        stack.add(8.8);

        System.out.println(stack.size());

        stack.push("dünya");
        System.out.println(stack.peek());

        System.out.println(stack.size());


    }
}
