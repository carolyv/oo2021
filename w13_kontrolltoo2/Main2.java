public class Main2 {
    public static void main(String[] args) {
        Vaartus vabaliikmega = new Vaartus(2, 3, 0, 0, 2);
        vabaliikmega.vaartused();

        Vaartus vabaliikmega2 = new Vaartus(2, 3, 0, 0, -2); // Negatiivse arvuga
        vabaliikmega2.vaartused();
    }
}
