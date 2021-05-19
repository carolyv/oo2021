public class Vaartus implements Liides {

    public int x;
    public int kordaja;
    public boolean kasJoonel;
    int punktX;
    int punktY;
    int vabaliige;

    public Vaartus(int x, int kordaja, int punktX, int punktY, int vabaliige) { // Oletades, et alati kujul y = ax + b
        this.x = x;
        this.kordaja = kordaja;
        this.punktX = punktX;
        this.punktY = punktY;
        this.vabaliige = vabaliige;
    }
    public int vaartused() {
        int y = (x * kordaja) + vabaliige;
        System.out.println("y = " + y);
        return y;
    }
    public void kasJoonel() {
        int vasakpool = punktY;
        int parempool = (kordaja * punktX) + vabaliige;
        if (vasakpool == parempool) {
            System.out.println("Punkt asub joonel!");
        } else {
            System.out.println("Punkt ei asu joonel!");
        }
    }
}
