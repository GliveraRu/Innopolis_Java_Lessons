import java.util.Scanner;

public class FuzzBuzz {
    public static void main(String[] args) {
        System.out.println("Меняет число, которое делится на 3 - на Buzz,\n на 5 - на Fuzz, если и на 3и и на 5 - то FuzzBuzz");
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1; i<=num; i++) {
            if (i%5==0 && i%3==0) {
                System.out.print("FuzzBuzz");
            }
            else if (i%5==0) {
                System.out.print("Fuzz");
            }
            else if (i%3==0) {
                System.out.print("Buzz");
            }
            else {
                System.out.print(i);
            }
            System.out.print(", ");

        }
    }
}
