import java.util.Scanner;

public class Task5 {
    //Составить программу, которая уменьшает первое введенное число в два раза,
    // если оно больше второго введенного числа по абсолютной величине.
    public static void main(String[] args) {
        System.out.println("Введите число 1:");
        Scanner so = new Scanner(System.in);
        int one = so.nextInt();
        System.out.println("Введите число 2:");
        Scanner st = new Scanner(System.in);
        int two = st.nextInt();
        if (one > two) {
            double resul = one/2.0;
            System.out.println("Число 1 = " + resul + ", Число 2 = " + two);
        }
        else if (one == two) {
            System.out.println("Числа равны");
        }
        else {
            System.out.println("Число 1 = " + one + ", Число 2 = " + two);
        }

    }
}
