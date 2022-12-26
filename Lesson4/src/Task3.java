import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//Не Автомат
//        Pyramid(5,1);
//        System.out.println();
//        Pyramid(5,2);
//        System.out.println();
//        Pyramid(5,3);
//        System.out.println();
//        Pyramid(5,4);
//        System.out.println();
//        Pyramid(5,5);
//        System.out.println();
// Автомат
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите какой символ отображать в пирамиде: ");
        String simvol = sc.next();
        System.out.println("Введите вершину пирамиды: ");
        int vershina =- sc.nextInt();
        System.out.println("Введите количество уровней: ");
        int urovni = sc.nextInt();

        for (int i=0; i<=urovni; i++) {
            vershina++;
            Pyramid(simvol,vershina);
            System.out.println();
        }




    }
    public static void Pyramid (String simvol, int count) {
        if (count>0) {
            count--;
            System.out.print(simvol+" ");
            Pyramid (simvol,count);
        }
    }
}
