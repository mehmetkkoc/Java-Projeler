package day10_Switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {

        // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu yazin");

        int ayNo = scan.nextInt();

        switch (ayNo) {

            case 12, 1, 2: // Virgulle de kullanilabilir
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("lutfen gecerli bir ay no yaziniz");
        }
    }
}