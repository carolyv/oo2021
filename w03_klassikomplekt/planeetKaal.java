import java.util.Scanner;

public class planeetKaal {

    public static void maaKaal() {
        System.out.println("Arvuta oma kaal meie päikesesüsteemi astronoomilistel objektidel!");
        Scanner kaal = new Scanner(System.in);
        System.out.println("Sisestage oma kaal (kg): ");
        double maaKaal = kaal.nextDouble();
        kaal.close();
        planeetArvutused.planeetideKaalud(maaKaal);

    }
}