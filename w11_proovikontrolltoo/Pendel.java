public class Pendel {
    public Pendel(double pikkus, int hammasrattad) throws InterruptedException {
        double x = pikkus;
        int y = hammasrattad;
        double vonkePeriood = 2 * Math.PI * Math.sqrt(x / 9.8);
        int vp = ((int) vonkePeriood) * 1000;
        int hammasrattaRingid = 0;
        int i = 0;
        while (true) {
            System.out.println("Tik");
            i++;
            Thread.sleep(vp);
            System.out.println("Tok");
            i++;
            Thread.sleep(vp);
            if ((i % y) == 0) {
                hammasrattaRingid++;
                System.out.println("Hammasratas tegi ringi! (" + hammasrattaRingid + ")");
            }
        }
    }
}