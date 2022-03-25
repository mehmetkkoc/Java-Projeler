package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=190;


        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden bir ternary yazin

        String sonuc= sayi>=100 ? "sayi 3 ve daha fazla basamakli" : "sayi negatif veya 3 basamaktan kucuk";
        System.out.println("sayi analizi : " + sonuc);

    }
}
