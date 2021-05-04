import java.util.*;

public class Satellite {
    public int distanceFromEarth;
    public int year;
    public int month;
    public int days;
    private int earthRadius = 6371;
    private double earthMass = 5.972 * Math.pow(10, 24);
    private double gravitationalConstant = 6.673 * Math.pow(10, -11);

    Calendar calendar = Calendar.getInstance();
    int dayNow = calendar.get(Calendar.DATE);
    int monthNow = (calendar.get(Calendar.MONTH));
    int yearNow = calendar.get(Calendar.YEAR);

    String[] months = { "january", "february", "march", "april", "may", "june", "july", "august", "september",
            "october", "november", "december" };
    int monthDaysCount;

    /*
     * Kuu pikkused päevades private int january = 31; private int february = 28; Ei
     * hakanud tegema liigaasta if-tsüklit private int march = 31; private int april
     * = 30; private int may = 31; private int june = 30; private int july = 31;
     * private int august = 31; private int september = 30; private int october =
     * 31; private int november = 30; private int december = 31;
     */

    public Satellite(int x, int days, int month, int year) {
        this.distanceFromEarth = x;
        this.year = year;
        this.month = month;
        this.days = days;
    }

    public void satelliteType() {
        String satType = "Sidesatelliit";
        System.out.println("Satelliidi tüüp: " + satType);
    }

    public void satelliteOrbit() {
        System.out.println("Orbiidi tüüp: Maa-lähedane orbiit");
    }

    public void satelliteSpeed() {
        // Arvutab satelliidi orbiidikiiruse
        int radius = (earthRadius + distanceFromEarth) * 1000;
        double formula1 = gravitationalConstant * earthMass;
        double formula2 = Math.sqrt(formula1 / radius);
        formula2 = (Math.round(formula2 * 100.0) / 100.0) / 1000;
        System.out.println("Kiirus orbiidil: " + formula2 + " km/s");
    }
    /*
     * public void satelliteAge() { // Arvutab mitu päeva on satelliit Maa orbiidil
     * rännanud String monthName = months[monthNow]; if(monthName == "february") {
     * monthDaysCount = 28; } else if (monthName == "april" || monthName == "june"
     * || monthName == "september" || monthName == "november") { monthDaysCount =
     * 30; } else { monthDaysCount = 31; } int yearsToDays = (yearNow - year) * 365;
     * int daysOnOrbit = days
     * System.out.println("Satelliit on Maa orbiidil rännanud juba " + daysOnOrbit +
     * " päeva."); System.out.println(dayNow); System.out.println(monthNow);
     * System.out.println(yearNow); }
     */

    public void satelliteActive() {
        System.out.println("Satelliidi olek: Töötab");
    }
}