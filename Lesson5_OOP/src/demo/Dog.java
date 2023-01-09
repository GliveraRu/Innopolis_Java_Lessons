package demo;

public class Dog extends Animals implements Behavior {
    public void bark() {
        System.out.println("Гав! Гав!");
    }

    @Override
    public void eat() {
        System.out.println("Жрет");

    }

    @Override
    public void sleep() {
        System.out.println("Спит на коврике");

    }
}
