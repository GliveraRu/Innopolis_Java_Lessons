import java.util.Scanner;

public class Task3 {
    // Дано трехзначное число. Найти:
    // 1.число единиц в нем;
    // 2.число десятков в нем;
    // 3.сумму его цифр;
    // 4.произведение его цифр
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>99) {
            int e = n%10;
            int d = (n/10)%10;
            int s = n/100;
            System.out.println("Число единиц в числе: "+e);
            System.out.println("Число десятков в числе: "+d);
            System.out.println("Сумма цифр: "+(e+d+s));
            System.out.println("Произведение цифр: "+(e*d*s));
        }
        else {
            System.out.println("Нужно ввести ТРЕХЗНАЧНОЕ число!");
        }

    }
}
