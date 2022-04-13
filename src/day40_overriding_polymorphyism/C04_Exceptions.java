package day40_overriding_polymorphyism;

public class C04_Exceptions {
    public static void main(String[] args) {


        // String olarak verilen bir sayiyi intager e cevirip
        // 2 katini ekranda yazdiralim

        String str = "1234a";


        /*
        str icinde sayi olmayan bir karakter verilirse
        NumberFormatException.forInputString verir

         */


        try {
            int sayi = Integer.parseInt(str);
            System.out.println("girilen sayini iki kati : "+sayi*2);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("girdiginiz String sayi olmayan elementler iceriyor");

        }

    }
}