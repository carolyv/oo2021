public class Test {
    // Kontrollime punkte (kas asuvad joonel y=3x)
    public static void main(String[] args) {
        Vaartus test1 = new Vaartus(2, 3, 0, 0, 0); // x = 2 punkt (0;0) (Asub)
        test1.vaartused();
        test1.kasJoonel();
        System.out.println("----------------");
        Vaartus test2 = new Vaartus(4, 3, 2, 2, 0); // x = 4 punkt (2;2) (Ei asu)
        test2.vaartused();
        test2.kasJoonel();
        System.out.println("----------------");
        Vaartus test3 = new Vaartus(1, 3, 2, 6, 0); // x = 4 punkt (2;6) (Asub)
        test3.vaartused();
        test3.kasJoonel();
        System.out.println("----------------");

        // y = 3x + 2
        Vaartus test4 = new Vaartus(1, 3, 0, 0, 2);
        test4.vaartused();
        System.out.println("----------------");
        Vaartus test5 = new Vaartus(1, 3, 0, 0, -2);
        test5.vaartused();
        System.out.println("----------------");
    }
}
