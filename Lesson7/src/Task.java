import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> list = new HashSet<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

    }
}
