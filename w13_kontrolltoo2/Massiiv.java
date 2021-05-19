import java.util.Arrays;

public class Massiiv {
    public static void main(String[] args){
        int[] xVaartused = new  int[] {2, 5, 1, 8, 9};
        int[] yVaartused = new int[xVaartused.length];
        for(int i = 0; i < xVaartused.length; i++){
            Vaartus x = new Vaartus(xVaartused[i], 3, 0, 0, 0); // Kujul y = 3x
            int yUus = x.vaartused();
            yVaartused[i] = yUus;

        }
        System.out.println(Arrays.toString(xVaartused));
        System.out.println(Arrays.toString(yVaartused));
    }

}
