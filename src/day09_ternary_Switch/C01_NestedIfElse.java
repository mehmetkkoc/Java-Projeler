package day09_ternary_Switch;

import java.util.Scanner;

public interface C01_NestedIfElse {
    public static void main(String[] args) {
        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 || sayi>9999){ // istenmeyen durum
            System.out.println("lutfen 4 basamakli bir sayi giriniz");
        }else if (sayi%5==0){ // sayi 5 e tam bolunuyor
            if (sayi%10==0){
                System.out.println("5 e bolenebilen cift sayi");
            }else{
                System.out.println("5 e bolunebilen tek sayi");
            }

        }else{
            System.out.println("Tekrar deneyin");
        }
    }
}
