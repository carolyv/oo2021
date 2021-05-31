public class Keskmine {
    double x;
    double y;
    double z;

    public Keskmine(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
    }
    // Koosta funktsioon kolme arvu aritmeetilise keskmise leidmiseks. Katseta.
    public void aritKesk() {
        double kesk = (x + y + z) / 3;
        System.out.println("Kolme arvu aritmeetiline keskmine on " + kesk);
    }
    public void libKesk() {
        System.out.println("Libisev keskmine");
    }
}