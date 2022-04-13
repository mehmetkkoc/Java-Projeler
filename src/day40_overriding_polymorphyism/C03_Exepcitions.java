package day40_overriding_polymorphyism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kontrol=0;

        while (kontrol<2) {
            System.out.println("bolmek istediginiz sayiyi giriniz");
            int sayi1 = scan.nextInt();
            System.out.println("kaca bolmek istediginizi giriniz");
            int sayi2 = scan.nextInt();

            try {
                System.out.println("sonuc = " + sayi1 / sayi2);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("hatali giris");
            }

            System.out.println("devam etmek icin 1 \nbitirmek icin 2 ye basin");

            kontrol=scan.nextInt();



        }
        /*
        sayi2 0 oldugunda sayi1 / 0  = tanimsiz olacagindan
        Java bu durumla karsilasinca execption verir
        Javanin yazdigi mesajda exeption in
        ne tur bir sorun oldugu
        sorunun ne oldugu
        ve hangi satirda oldugunu yazar

                Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_polymorphyism.C03_Exepcitions.main(C03_Exepcitions.java:13)

        Bunu cozmek icin sayi2 yi if ile kontrol edebiliriz


        if (sayi2==0){
            System.out.println("Sayi/0 tanimsizdir");
        }else {
            System.out.println("sonuc = " + sayi1 / sayi2);
        }

        Ama bu yontem her sorunda calismaz

         */
    }
}
