package day38_inheritence_overriding;

public class Ustabasi extends Isci{
    public String statu="Ustabasi";
    public String haklar="Ustabasi haftada bir gun ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa Ustabasi ekstra ucret almadan calisir");
    }

    public void maasHesapla(){
        System.out.println("Ustabasi 30 gun *8 saat*12 euro= "+(30*8*12)+" Euro maas alir");
    }

    public static void main(String[] args) {

        /*
        Icinde oldugumuz classtan klasik halde bir obje olusturursak
        o obje ile cagirdigimiz variable ve methodlarda
        Java once icinde bulundugumuz class a bakar
         */
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu); // Ustabasi
        System.out.println(yasin.haklar); // Ustabasi haftada bir gun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye); //isciler yilda bir ikramiye alir
        System.out.println(yasin.izin); // Tum personel 4 hafta izin kullanir
        yasin.maasHesapla();
        yasin.mesai();


        /*
        Eger isci olarak ozelliklerini gormek istersek
        Class adini (Data Turu) Isci seceriz
         */
        Ustabasi ahmet=new Ustabasi();

        System.out.println(ahmet.statu);    // Ustabasi
        System.out.println(ahmet.haklar);   // Ustabasi haftada bir gun ekstra tatil hakkina sahiptir
        System.out.println(ahmet.ikramiye); // isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin);     // Tum personel 4 hafta izin kullanir
        ahmet.maasHesapla();
        ahmet.mesai();


        /*
        Bir objeyi hangi class tan tanimlarsaniz o class a ait ozelliklere sahip olur

         */
        Personel adem=new Ustabasi();

        System.out.println(adem.statu);    // Personel
        System.out.println(adem.haklar);   // Tum personel esit haklara sahiptir
        // System.out.println(adem.ikramiye); // CTE verir
        System.out.println(adem.izin); // Tum personel 4 hafta izin kullanir
        adem.maasHesapla();
        adem.mesai();
        /*
        Personel adem=new Ustabasi(); Bu bir Ustabasi objesi
        Personel adem=new Personel(); Bu bir Personel Objesidir

         */
        /*
        Personel adem=new Ustabasi();

        ademin data turu personel dir
        boylece biz ademi ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben ademin ustabasi oldugunu biliyorum
        cunku constructor i ustabasi
        Ama bu yazim formati ile ademin tum personel ile birlikte sahip oldugu
        ortak ozellikleri vurgulamak istiyorum
        Bu kulklanim seklinde olusturulan obje data turu olarak secilen class
        ve onun parent class larindaki variable leri olusturabilirim
         */

    }
}
