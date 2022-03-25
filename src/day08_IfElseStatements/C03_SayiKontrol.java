package day08_IfElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse
        // “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 2 sayi giriniz");
        double num1= scan.nextDouble();
        double num2= scan.nextDouble();
        if (num1==0 || num2==0){
            System.out.println("sifir carpmaya gore yutan elemandir");
        }else if (num1>0 && num2>0){
            System.out.println("Toplam: " +(num1+num2));
        }else if (num1<0&&num2<0){
            System.out.println("carpim: "+(num1*num2));
        }else {
            System.out.println( "farkli isaretlerde sayilarla islem yapamazsin");
        }
    }
}
