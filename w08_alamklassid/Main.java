public class Main {
    public static void main(String[] args) {
        Viasat2 viasat = new Viasat2(35706, 2, 6, 2017); // Sisestus: Kõrgus maapinnalt, pöev, kuu, aasta (Kuupäev on
                                                         // launch date)
        Iridium33 iridium = new Iridium33(589, 14, 9, 1997);
        System.out.println("--------------------------------");
        viasat.satelliteName();
        viasat.satelliteType();
        viasat.satelliteOrbit();
        viasat.satelliteSpeed();
        viasat.satelliteMission();
        viasat.satelliteActive();
        System.out.println("--------------------------------");
        iridium.satelliteName();
        iridium.satelliteType();
        iridium.satelliteOrbit();
        iridium.satelliteSpeed();
        iridium.satelliteMission();
        iridium.satelliteActive();
        System.out.println("--------------------------------");
    }
}
