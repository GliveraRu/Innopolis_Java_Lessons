package zoo;
// Может быть голодным и покусанным
// обходит каждое животное и проверяет его здоровье
// помещает его в карантин, изолируя от других животных
// возвращает животное в обычный вольер
// обедает
// Следит за белками
// Накладывает повязку
public class Veterinar extends Human {
    public Veterinar() {
        profession = "Ветеринар";
    }

    @Override
    void obed() {
        if (golodny) {
            System.out.println("Ветеринар пообедал");
            golodny = false;
        } else {
            System.out.println("Ветеринар не голодный...");
        }
    }

    @Override
    void povazka() {
        if (pokusan) {
            System.out.println("Ветеринара покусали, накладывает повязку");
            pokusan = false;
        } else {
            System.out.println("Ветеринара не покусали...");
        }
    }

    public void proveritHealt(Animal animal) {
        System.out.println(profession + " проверяет здоровье " + animal.name);
        if (!animal.zdorov) {
            System.out.println("Животное заболело!\n" + animal.name + " на карантине!");
            animal.cage = "на карантине";

        } else {
            System.out.println(animal.name + " здоров!");
        }
    }

    void karantin(Animal animal) {
        System.out.println(profession + " смотрит на здоровье " + animal.name);
        if (animal.zdorov) {
            System.out.println("Животное здорово!");
            if (animal.cage == "на карантине") {
                System.out.println(animal.name + " возвращается в вольер.");
            } else {
                System.out.println("Погладим его)");
            }
            animal.cage = "В вольере";

        } else {
            System.out.println(animal.name + " все еще болен!");
            animal.cage = "на карантине";
        }
    }
}