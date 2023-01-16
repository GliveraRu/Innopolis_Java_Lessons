import java.util.ArrayDeque;

public class Demo_Queue {
    public static void main(String[] args) {
        ArrayDeque<Integer> myArray = new ArrayDeque<>();
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.push(1);
        System.out.println(myArray);
        System.out.println(myArray.peek());
        System.out.println(myArray.pop());
        System.out.println(myArray);
        System.out.println(myArray.poll());
        System.out.println(myArray);
        System.out.println(myArray.pop());
        System.out.println(myArray);
        System.out.println(myArray.pop());
        System.out.println(myArray);
        System.out.println(myArray.pop());
        System.out.println(myArray);
        System.out.println(myArray.poll());
        System.out.println(myArray);
    }
}
