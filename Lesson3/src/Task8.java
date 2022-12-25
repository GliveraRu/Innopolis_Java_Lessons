//Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
import java.util.Scanner;
class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите радиус и Сторону квадрата: ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int r = sc1.nextInt();
        double pi = Math.PI;
        double P = pi*(r*r);
        int s = sc2.nextInt();
        double S = s * s;
        if (S>P) {
            System.out.println("Площадь круга = "+P);
            System.out.println("Площадь квадрата = "+S);
            System.out.println("Площадь Квадрата больше площади Круга");
        }
        else if (P>S) {
            System.out.println("Площадь круга = "+P);
            System.out.println("Площадь квадрата = "+S);
            System.out.println("Площадь Круга больше площади Квадрата");
        }
        else {
            System.out.println("Одинаковые");
        }
    }
}
