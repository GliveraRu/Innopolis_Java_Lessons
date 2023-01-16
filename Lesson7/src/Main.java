import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boolean> myList = new ArrayList<>();
        myList.add(true);
        myList.add(false);
        myList.remove(1);
        System.out.println(myList);
    }
}