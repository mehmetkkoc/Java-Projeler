package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("LÜTFEN İSMİNİZİ GİRİNİZ");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("isminizin ilk harfi : "+ilkHarf );
    }
}
