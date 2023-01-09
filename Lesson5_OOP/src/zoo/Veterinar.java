package zoo;
// Может быть голодным и покусанным
// обходит каждое животное и проверяет его здоровье
// помещает его в карантин, изолируя от других животных
// возвращает животное в обычный вольер
// обедает
// Следит за белками
// Накладывает повязку
public class Veterinar extends Human {
    public Veterinar () {
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

}
