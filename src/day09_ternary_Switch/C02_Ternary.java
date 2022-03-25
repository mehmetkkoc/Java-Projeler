package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // Ternary ile yapilan islemler if else ile de yapilabilir
        // If Else yerine ternary tercih etme sebebi yapilan basit ve anlasilabilir olmasidir
        // ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir dogal sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");
        }else{
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0 ? "Cift" : "Tek");

    }
}
