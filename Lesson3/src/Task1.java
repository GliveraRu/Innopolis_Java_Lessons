import java.util.Scanner;
//Найти длину окружности радиуса 4
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус");
        int r = sc.nextInt();
        double pi = Math.PI;
        double S = 2*pi*r;
        System.out.println("Длинна окружности: "+ S);
            }
}
