package demo;

public interface Behavior {
    default void bite () {
        System.out.println("Кусает!");
    }
}
