public class Pendel {
    public Pendel(double pikkus) throws InterruptedException {
        double x = pikkus;
        double vonkePeriood = 2 * Math.PI * Math.sqrt(x / 9.8);
        int vp = ((int) vonkePeriood) * 1000;
        while (true) {
            System.out.println("Tik");
            Thread.sleep(vp);
            System.out.println("Tok");
            Thread.sleep(vp);
        }
    }
}