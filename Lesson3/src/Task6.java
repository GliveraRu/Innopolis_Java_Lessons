import java.util.Scanner;

public class Task6 {
    //Известен вес боксера-любителя. Известно, что вес таков,
    // что боксер может быть отнесен к одной из трех весовых категорий:
    // легкий вес — до 60 кг;
    // средний вес — до 75 кг;
    // тяжелый вес — до 91 кг;
    // супертяжелый вес – с 91 кг.
    //Определить, в какой категории будет выступать данный боксер
    public static void main(String[] args) {
        System.out.println("Введите вес:");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        if (weight>=91) {
            System.out.println("Категория - СУПЕРТЯЖЕЛЫЙ ВЕС");
        }
        else if (weight>=75) {
            System.out.println("Категория - ТЯЖЕЛЫЙ ВЕС");
        }
        else if (weight>=60) {
            System.out.println("Категория - СРЕДНИЙ ВЕС");
        }
        else {
            System.out.println("Категория - ЛЕГКИЙ ВЕС");
        }

    }
}
