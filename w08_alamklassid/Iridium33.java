public class Iridium33 extends Satellite {

    public Iridium33(int x, int days, int month, int year) {
        super(x, days, month, year);
    }

    public void satelliteName() {
        System.out.println("Sateliidi nimi: Iridium 33");
    }

    public void satelliteMission() {
        System.out.println("Satelliidi missioon: Kommunikatsioon");
    }

    public void satelliteRocket() {
        System.out.println("Satelliidi rakett: Proton-K");
    }

    @Override
    public void satelliteActive() {
        System.out.println("Satelliidi olek: Hävinenud kokkupõrkes");
    }

}
