package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Yarıçap Giriniz");
        double yc= scan.nextDouble();

        System.out.println("Çemberin çevresi= "+(2*3.14*yc));
        System.out.println("Dairenin alanı= "+(3.14*yc*yc));

    }
}
