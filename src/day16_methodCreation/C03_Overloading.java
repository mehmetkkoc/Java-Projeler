package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {

        //verilen iki sayiyi toplayan yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;

        ikiSayiyiTopla(sayi1, sayi2);

        // iki double sayi taoplayan method olustur

        double sayi3=15.2;
        double sayi4=10.3;

        ikiSayiyiTopla(sayi3,sayi4);

        // eger variable olusturmadan direk satilari yazarak method call yaparsam

        ikiSayiyiTopla(15,25); // int toplam verir
        ikiSayiyiTopla(15.7,25.8); // double toplam verir

        // bir integer ile bir double toplamini yazdiran bir method olusturun

        int sayi5=3;
        double sayi6=3.2;

        ikiSayiyiTopla(sayi5,sayi6);




    }
    private static void ikiSayiyiTopla(int sayi3, double sayi4) {
        System.out.println("bir integer bir double toplami : "+(sayi3+sayi4));
    }

    private static void ikiSayiyiTopla(double sayi3, double sayi4) {
        System.out.println("iki double toplami : "+(sayi3+sayi4));
    }

    private static void ikiSayiyiTopla(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : "+(sayi1+sayi2));
    }


}
