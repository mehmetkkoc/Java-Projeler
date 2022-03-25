package day19_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin

        Scanner scan=new Scanner(System.in);
        int sayi=1;
        int bolen=1;
        int sayac=0;

        while (bolen<=sayi){
            if (sayi%bolen==0){
                System.out.print(bolen+" ");
                sayac++;
            }
            bolen++;


        }
        System.out.println("");
        System.out.println(sayi+" sayisini tam bolen "+ (sayac)+ " adet sayi vardir");




    }


}
