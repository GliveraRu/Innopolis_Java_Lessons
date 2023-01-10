package zoo;
//Кусаются
//Болеют
public class Animal {
    String name;
    boolean zdorov = true;
    String cage = "В вольере";

    public void ukus (Animal animal,Human human) {
        human.pokusan = true;
        System.out.println(animal.name + " покусал " + human.profession);
    }

}
