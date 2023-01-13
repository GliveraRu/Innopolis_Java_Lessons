
import java.util.Scanner;

import static java.util.Arrays.deepToString;

/* 1. Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры входе выполнения программы.
Дан массив. Составить программу:
 1.расчета квадратного корня из любого элемента массива;
 2.расчета среднего арифметического двух любых элементов массива*/
public class Task1 {
    public static void main(String[] args) {
        Integer [] massive = new Integer[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 значений:");
        for (int i=0; i<10;i++) {
           massive[i] = sc.nextInt();
        }
/*
        for (int i=0; i<10;i++) {
            if (i<9) System.out.print(massive[i] + ", ");
            else System.out.print(massive[i]);
        }
*/
    // Вывод
        System.out.println(deepToString(massive));
        System.out.println("Введите индекс элемента массива, для поиска кв. корня");
        int x = massive[sc.nextInt()];
        double y = sqrt(x);
        System.out.println("Квадратный корень из "+x+" = "+y);

        System.out.println("Введите 2а индекса элементов массива, для поиска их среднего значения");
        System.out.println("Среднее значение = "+sred(massive[sc.nextInt()],massive[sc.nextInt()]));

    }
    // Методы
    public static double sqrt (int element) {
        return Math.sqrt(element);
    }
    public static double sred (int element1, int element2) {
        return (element1+element2)/2.0;
    }
}
