public class Proov {
    public static void main(String[] arg) {
        Jupiter jup = new Jupiter();
        Saturn sat = new Saturn();
        System.out.println("Jupiteri sisse mahub " + Math.round(jup.ruumala(69911.0)) + " Maad.");
        System.out.println("Saturni sisse mahub " + Math.round(sat.ruumala(58232.0)) + " Maad.");
    }
}