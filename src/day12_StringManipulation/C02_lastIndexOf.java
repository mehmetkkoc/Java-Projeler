package day12_StringManipulation;

import java.util.Scanner;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next().toLowerCase();
        int ilkKullanim = cumle.indexOf(kelime);
        int sonKullanim=cumle.lastIndexOf(kelime);

        if (sonKullanim==-1){
            System.out.println("Kullanilmamis");
        }else if (ilkKullanim==sonKullanim){
            System.out.println("1 kere kullanilmis");
        }else{
            System.out.println("1 den fazla kullanilmistir");
        }
        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));

    }
}
