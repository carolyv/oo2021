public class Viasat2 extends Satellite {

    public Viasat2(int x, int days, int month, int year) {
        super(x, days, month, year);
    }

    public void satelliteName() {
        System.out.println("Sateliidi nimi: ViaSat-2");
    }

    @Override
    public void satelliteType() {
        String satType = "Kommertssatelliit";
        System.out.println("Satelliidi tüüp: " + satType);
    }

    @Override
    public void satelliteOrbit() {
        System.out.println("Orbiidi tüüp: Geostatsionaarne orbiit");
    }

    public void satelliteMission() {
        System.out.println("Satelliidi missioon: Kommunikatsioon");
    }

    public void satelliteRocket() {
        System.out.println("Satelliidi rakett: Ariane 5");
    }
}
