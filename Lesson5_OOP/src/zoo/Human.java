package zoo;
// Может быть голодным и покусанным
// обедает
// Следит за белками
// Накладывает повязку
public abstract class Human {
    boolean golodny;
     boolean pokusan;

    String profession;

    abstract void obed();
    void sledit(Belki belki) {
        System.out.println(profession + " следит за " + belki.name);
        if (belki.cage == "вне вольера") {
            System.out.println(belki.name + " пойман!");
            belki.cage = "В вольере";
        } else {
            System.out.println("Белка в вольере");
        }
    }
    abstract void povazka();

}
