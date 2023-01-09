package demo;

public class Human extends Animals implements Behavior {
    public void name (String name) {
        System.out.println("Меня зовут " + name);
    }
    public void age (int age) {
        System.out.println("Мне " + age + " лет.");
    }

    @Override
    public void eat() {
        System.out.println("Ест");

    }

    @Override
    public void sleep() {
        System.out.println("Спит в кроватке");

    }
}
