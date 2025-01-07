package pkg11_lkpersegi;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Menghitung Luas dan Keliling Persegi
        
        /*
        L = sisi x sisi
        K = 4 x sisi
        */
        
        Scanner input = new Scanner(System.in);
        int s, L, K;
        
        System.out.print("Masukan sisi persegi = ");
        s = input.nextInt();
        
        L = s * s;
        K = 4 * s;
        
        // Narasi Luas Persegi
        System.out.println("L = sisi x sisi");
        System.out.println("L = "+s+" x "+s);
        System.out.println("Luas Persegi adalah = " + L + "\n");
        
        // Narasi Keliling Persegi
        System.out.println("K = 4 x sisi");
        System.out.println("K = 4"+" x "+s);
        System.out.println("Keliling Persigi adalah = " + K);
    }
    
}
