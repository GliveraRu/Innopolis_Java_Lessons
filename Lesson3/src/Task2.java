import java.util.Scanner;

public class Task2 {
    //Известно значение температуры по шкале Цельсия 36,6. Найти соответствующеезначение температуры по шкале:
    //Фаренгейта и Кельвина
    public static void main(String[] args) {
        System.out.println("Введитетемпературу в Цельсиях:");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = c*1.8+32;
        double k = 273.15 + c;
        System.out.println(c + " по Цельсию = " + f + " по Фаренгейту");
        System.out.println(c + " по Цельсию = " + k + " по Кельвину");
    }
}
