import java.util.ArrayDeque;
import java.util.Stack;

public class Demo_Stack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.add(2);
        myStack.push(2);
        myStack.add(3);
        myStack.add(4);
        myStack.add(5);
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack);


        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);


    }
}
