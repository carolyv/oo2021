public class Satelliit {

    String name;
    double height;

    public Satelliit(String satelliteName, double satelliteHeight){
        name = satelliteName;
        height = satelliteHeight;
    }

    public double taisRaadius(){
        double raadius = 6371 + height;
        return raadius;
    }
    public double orbitalPeriod(){
        double raadius = (taisRaadius() * 1000);
        // V arvutamine
        double velocity = Math.sqrt((3.98600 * Math.pow(10, 14)) / raadius);
        // Orbital Period
        double orbitalPeriod = (2 * Math.PI) * (raadius / velocity);
        return orbitalPeriod;
    }
    
    public static void main(String[] args){
        Satelliit estCube1 = new Satelliit("ESTCube-1", 665);
        Satelliit aura = new Satelliit("Aura", 705);
        System.out.println("Satelliidi " + estCube1.name + " tiirlemisperiood on ligikaudu " + (estCube1.orbitalPeriod() / 60) + " minutit.");
        System.out.println("Satelliidi " + aura.name + " tiirlemisperiood on ligikaudu " + (aura.orbitalPeriod() / 60) + " minutit.");
    }
}