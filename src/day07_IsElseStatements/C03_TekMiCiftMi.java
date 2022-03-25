package day07_IsElseStatements;

import java.util.Scanner;

public class C03_TekMiCiftMi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int num1=scan.nextInt();

        if (num1%2==0) {
            System.out.println("sayi cifttir");
        }
            if (num1%2 != 0){
                System.out.println("sayi tektir");
        }
            // normalde bir tam sayi ya tektir ya da cifttir
            // o zaan tek olmasi ve cift olmasi 2 ayri if ifadesiyle degil
            // if else ifadesiyle yapilir

            // ==== if else ile cozum ====

        if (num1%2==0){
            System.out.println("sayi cift olur");

        }else{
            System.out.println("sayi tek olur");
    }
}}

