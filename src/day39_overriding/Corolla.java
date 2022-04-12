package day39_overriding;

public class Corolla extends Toyota {
    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla cevreci motor kullanirlar");

    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 vitestir");
    }

    public static void main(String[] args) {
        /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor in ozelligini tasir
        ancak Data turu Parent Class secildigi icin
        variableler data turunun secildigi class lar ve
        onun parent class larindan deger alabilir
         */

        /*
        Methodlar icin ise yine Data turunun oldugu class a gideriz
        ancak direk methodu calistirmadan once
        method override edilmis mi diye kontrol ederiz
         */

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket); // araba
        System.out.println(arb1.hiz);       // corolla
        System.out.println(arb1.yakit);     // corolla
        System.out.println(arb1.marka);     // toyota
        System.out.println(arb1.sirketMerkezi); // toyota
        System.out.println(arb1.model);         // corolla
        arb1.motor();   // corolla

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket); // araba
        System.out.println(arb2.hiz);       // toyota
        System.out.println(arb2.yakit);     // araba
        System.out.println(arb2.marka);     // toyota
        System.out.println(arb2.sirketMerkezi); // toyota
        // System.out.println(arb2.model);         // CTE
        arb2.motor();   // corolla
        arb2.garanti(); // toyota
        arb2.yakitTuketimi(); // corolla
        // arb2.vitesSayisi(); data turu olan toyota dan baslayinca
        // boyle bir method bulamadik
        // dolayisiyla CTE


        Araba arb3=new Corolla();
        System.out.println(arb3.hareket); // araba
        System.out.println(arb3.hiz);       //araba
        System.out.println(arb3.yakit);     // araba
        System.out.println(arb3.marka);     // araba
        //System.out.println(arb3.sirketMerkezi); // CTE
        //System.out.println(arb3.model);         // CTE
        arb3.yakitTuketimi(); // corolla
        arb3.motor(); // Corolla
        // arb3.garanti(); araba classinda garanti methodu olmadigi icin CTE
        // arb3.vitesSayisi(); ayni sebep


    }
}
