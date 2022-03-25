package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tam sayi giriniz");

        int num = scan.nextInt(); // 7532

        int rakam = 0;
        int toplam = 0;

        rakam = num % 10; // 2
        toplam += rakam; //2
        num /= 10; // 753
        rakam = num % 10; // 3
        toplam += rakam; //5
        num /= 10;//75
        rakam = num % 10; // 5
        toplam += rakam; //10
        num /= 10; // 7
        rakam = num % 10; // 7
        toplam += rakam; //17

        System.out.println(toplam);
    }

    }
