public class Funktsioonid1{
    // Koostage funktsioon taksosõidu hinna kohta
    // Sisendiks kilomeetrite arv, väljundiks hind
    // Sisseastumistasu 3 eurot, kilomeetri hind 80 senti.
    public static double taksoSoit(double i){
        return 3+i*0.8;
    }
    public static String temperatuuriHinnang(int t){
        if(t<18){return "külm";}
        return "soe";
    }
    public static double ringiPindala (double r){
        return Math.PI*r*r;
    }
    public static void main(String[] arg){
        System.out.println(ringiPindala(5));
        System.out.println(taksoSoit(10));
        if(arg.length==1){
            System.out.println(temperatuuriHinnang(Integer.parseInt(arg[0])));
        }
    }
}