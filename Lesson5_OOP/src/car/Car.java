package car;

import java.util.Scanner;

public class Car {
    static int count = 0;
    //Создайте атрибуты класса Car — color (цвет), type (тип), year (год).
    String color;
    String type;
    int year;
    public static int countCars() {
        count++;
        System.out.println("\nСоздан автомобиль № " + count);
        return count;
    }
    //Напишите пять методов:
    //Первый — запуск автомобиля, при его вызове выводится сообщение«Автомобиль заведен»
    public void start() {
        System.out.println("Автомобиль заведен!");
    }
    //Второй — отключение автомобиля — выводит сообщение «Автомобильзаглушен».
    public void stop() {
        System.out.println("Автомобиль заглушен!");
    }
    //Третий — присвоение автомобилю года выпуска.
    //из обучения
    public void setYear (int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    // Мой
//    public int Year () {
//        countCars();
//        System.out.println("Введите годы выпуска автомобиля:");
//        Scanner sc = new Scanner(System.in);
//        year = sc.nextInt();
//        return year;
//    }

    //Четвертый метод — присвоение автомобилю типа.
    //из обучения
    public void setType (String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    // Мой
//    public String Type () {
//
//        System.out.println("Введите тип автомобиля:");
//        Scanner sc = new Scanner(System.in);
//        type = sc.next();
//        return type;
//    }
    // Пятый — присвоение автомобилю цвета.
    //из обучения
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    // Мой
//    public String Color () {
//        System.out.println("Введите цвет автомобиля:");
//        Scanner sc = new Scanner(System.in);
//        color = sc.next();
//        return color;
//    }
    // Конструктор
    public Car(){

    }
    public Car(int year, String type, String color) {
        this.color = color;
        this.type = type;
        this.year = year;
    }

}
