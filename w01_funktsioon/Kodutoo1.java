import java.util.Scanner;

public class Kodutoo1 {

    public static void main(String[] args) {

        Scanner years = new Scanner(System.in);
        System.out.println("Sisesta aasta/d: ");
        int a = Integer.parseInt(years.nextLine());
        moonDistance(a);
    }
    public static void moonDistance(int a) {
        System.out.print("Kuu on "+a+" aasta pärast Maast kaugenenud "+(a * 3.78)+" cm.");
    }
}
