public class Komeet2{
    public static void main(String [] args){

        Komeet uusKomeet = new Komeet();
        uusKomeet.name = "Neowise";
        uusKomeet.discoveryYear = 2020;
        uusKomeet.diameter = 5;

        Komeet uusKomeet2 = new Komeet();
        uusKomeet2.name = "Halley";
        uusKomeet2.discoveryYear = 1758;
        uusKomeet2.diameter = 5.5;

        // Komeedi andmete väljastamine
        System.out.println("Komeet " + uusKomeet.name + " avastati aastal " + uusKomeet.discoveryYear + ".");
        System.out.println("Selle läbimõõt on " + uusKomeet.diameter + " km.");
        System.out.println();
        System.out.println("Komeet " + uusKomeet2.name + " avastati aastal " + uusKomeet2.discoveryYear + ".");
        System.out.println("Selle läbimõõt on " + uusKomeet2.diameter + " km.");
    }
}