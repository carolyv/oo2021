public class planeetArvutused {

    public static void planeetideKaalud(double maaKaal) {

        double paikeKaal = maaKaal * 28.02;
        System.out.println("Päike: " + String.format("%.1f", paikeKaal) + " kg");
        double merkuurKaal = maaKaal * 0.377;
        System.out.println("Merkuur: " + String.format("%.1f", merkuurKaal) + " kg");
        double veenusKaal = maaKaal * 0.905;
        System.out.println("Veenus: " + String.format("%.1f", veenusKaal) + " kg");
        double kuuKaal = maaKaal * 0.165;
        System.out.println("Kuu: " + String.format("%.1f", kuuKaal) + " kg");
        double marssKaal = maaKaal * 0.379;
        System.out.println("Marss: " + String.format("%.1f", marssKaal) + " kg");
        double jupiterKaal = maaKaal * 2.528;
        System.out.println("Jupiter: " + String.format("%.1f", jupiterKaal) + " kg");
        double saturnKaal = maaKaal * 1.065;
        System.out.println("Saturn: " + String.format("%.1f", saturnKaal) + " kg");
        double uraanKaal = maaKaal * 0.886;
        System.out.println("Uraan: " + String.format("%.1f", uraanKaal) + " kg");
        double neptuunKaal = maaKaal * 1.137;
        System.out.println("Neptuun: " + String.format("%.1f", neptuunKaal) + " kg");
        double pluutoKaal = maaKaal * 0.063;
        System.out.println("Pluuto: " + String.format("%.1f", pluutoKaal) + " kg");

    }
}