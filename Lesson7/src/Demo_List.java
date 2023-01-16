import java.util.ArrayList;

public class Demo_List {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Peer");
        myList.add("Melon");
        myList.add("Melon");
        myList.add("Peach");
        System.out.println(myList);
        myList.remove(0);
        myList.remove("Melon");
        System.out.println(myList);

    }
}
