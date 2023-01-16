import java.util.HashSet;

public class Demo_Set {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Car");
        mySet.add("Window");
        mySet.add("Home");
        mySet.add("Door");

        System.out.println(mySet);
        System.out.println(mySet.size());
    }
}
