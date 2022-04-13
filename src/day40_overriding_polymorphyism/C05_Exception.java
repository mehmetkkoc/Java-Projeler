package day40_overriding_polymorphyism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {

    /*
    kullanicidan istedigi kadar sayiyi alip toplayan bir program yazin
    Toplam 500 u gecerse programi bitirsin
    kullanici bitirmek istediginde Q ya basmalidir
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        do{
            System.out.println("lutfen toplamak istediginiz sayiyi giriniz\nbitirmek icin Q ya basin");

          try {
                sayi=scan.nextInt();
                toplam+=sayi;
            } catch (InputMismatchException e) {
              String hataliGiris=scan.next();
              if(hataliGiris.equalsIgnoreCase("q")){
                  break;
              }else {
                  System.out.println("hatali giris");
              }
          }



        }while(toplam<500);
        System.out.println("toplam : "+toplam);
    }
}