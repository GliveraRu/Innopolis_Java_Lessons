package car;

public class CarTestDeive {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("Белый");
        car1.setType("ВАЗ");
        car1.setYear(2000);
        System.out.println("Машина номер 1");
        System.out.println("Год выпуска: " + car1.year);
        System.out.println("Тип: " + car1.type);
        System.out.println("Цвет: " + car1.color);

        Car car2 = new Car(2000, "KIA", "Оранжевая");
        System.out.println("Машина номер 2");
        System.out.println("Год выпуска: " + car2.year);
        System.out.println("Тип: " + car2.type);
        System.out.println("Цвет: " + car2.color);
//        Car car1 = new Car();
//        car1.Year();
//        car1.Type();
//        car1.Color();
//        car1.stop();
//        System.out.println(car1.type +", " + car1.color + ", " + car1.year + " " + "годa выпуска");
//
//        Car car2 = new Car();
//        car2.Year();
//        car2.Type();
//        car2.Color();
//        car2.start();
//        System.out.println(car2.type +", " + car2.color + ", " + car2.year + " " + "годa выпуска");
    }
}
