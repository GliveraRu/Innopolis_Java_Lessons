import java.util.Scanner;

public class Task4 {
    //Дано натуральное число. Определить:
    // является ли оно четным;
    // оканчивается ли оно цифрой 7
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n%2) == 0) {
            System.out.print("Число ЧЕТНОЕ, ");
        }
        else {
            System.out.print("НЕЧЕТНОЕ, ");
        }
        if ((n%10) == 7) {
            System.out.print("заканчивается на 7");
        }
        else {
            System.out.print("заканчивается НЕ на 7");
        }

    }
}
