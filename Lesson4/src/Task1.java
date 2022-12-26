import java.util.Scanner;

public class Task1 {
    // Мой метод
    public static int cikl (int a) {
        int result = a;
        for (int i=0; i<5; i++) {
            System.out.print(result+"\t");
            System.out.print(result+"\t");
            System.out.print(result+"\t");
            System.out.print(result+"\t");
            System.out.println(result+"\t");
        }
        return result;

    }

    // Метод из обучения

    public static void printLine (int number) {
        System.out.printf("%d %d %d %d %d %d \n", number,number,number,number,number,number);

    }

    // Метод из чата
    public static void Pyramid (int number, int count) {
        if (count>0) {
            count--;
            System.out.print(number+" ");
            Pyramid (number,count);
        }
    }




    public static void main(String[] args) {

//        printLine(1);
//        printLine(2);
//        printLine(3);
//        printLine(4);
// Для моего и учебного методов
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i=0;i<1;i++) {
//        cikl(a);
// Для метода из чата
//        Pyramid(5,5);
//        System.out.println();
//        Pyramid(5,5);
//        System.out.println();
//        Pyramid(5,5);
//        System.out.println();
//        Pyramid(5,5);
//        System.out.println();
//        Pyramid(5,5);
//        System.out.println();
//        }

    }
}
