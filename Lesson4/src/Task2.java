import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        bool(a);
        //System.out.println(greather(a));


    }
    // Мой Вариант
    public static void bool (int a) {
        if (a>=5) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    // Вариант из обучалки
    public static boolean greather (int number) {
        if (number>=5) {
            return true;
        }
        else {
            return false;
        }
    }
}
