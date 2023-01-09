package zoo;
// Может быть голодным и покусанным
// кормит всех животных
// вычесывает
// меняет бегемоту воду
// обедает
// Следит за белками
// Накладывает повязку
public class Zookeeper extends Human {
    public Zookeeper() {
        profession = "Смотритель";
    }
    @Override
    void obed() {
        if (golodny) {
            System.out.println("Смотритель пообедал");
            golodny = false;
        } else {
            System.out.println("Смотритель не голодный...");
        }
    }




    @Override
    void povazka() {
        if (pokusan) {
            System.out.println("Смотрителя покусали, накладывает повязку");
            pokusan = false;
        } else {
            System.out.println("Смотрителя не покусали...");
        }

    }
}
