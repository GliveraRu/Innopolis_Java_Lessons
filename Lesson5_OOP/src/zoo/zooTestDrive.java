package zoo;

public class zooTestDrive {
    public static void main(String[] args) {
        Cats lion = new Cats();
        lion.name = "Кузя";
        Cats tiger = new Cats();
        tiger.name = "Жора";
        Begemot begemot = new Begemot();
        begemot.name = "Дося";
        Belki belka1 = new Belki();
        belka1.name = "Стрелка";
        Belki belka2 = new Belki();
        belka2.name = "Ловкач";

        Veterinar veterinar = new Veterinar();
        Zookeeper zookeeper = new Zookeeper();
    }
}
