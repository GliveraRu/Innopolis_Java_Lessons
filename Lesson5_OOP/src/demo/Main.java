package demo;

public class Main {
    public static void main(String[] args) {
        Men men1 = new Men();
        men1.name("Aнтон");
        men1.age(36);
        men1.eat();
        men1.sleep();

        Dog dog1 = new Dog();
        dog1.name = "Шарик";
        dog1.bark();
        dog1.eat();
        dog1.sleep();
        dog1.bite();

        Tools tool = new Tools();
        tool.bite();


    }
}
