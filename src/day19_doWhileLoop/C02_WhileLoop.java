package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int sayi=75;
        int rakam=0;
        int rakamlarToplami=0;

        while (sayi>0) {
            rakam=sayi%10;
            rakamlarToplami+=rakam;
            sayi/=10;
            
        }
        System.out.println(rakamlarToplami);
    }
}
