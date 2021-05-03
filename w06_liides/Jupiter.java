public class Jupiter implements Planeedid {

    public double ruumala(double r) {
        double planeediRuumala = (4.0 / 3) * Math.PI * Math.pow(r, 3); // Ringi ruumala valem
        double maaMahtuvus = planeediRuumala / 1083206916846.0; // Maa ruumala kuupkilomeetrites
        return maaMahtuvus;
    }
}