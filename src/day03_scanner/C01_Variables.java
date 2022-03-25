package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

        //1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulIsmi="YBAL";
        System.out.println(okulIsmi);// YBAL

        char ilkHarf;
        ilkHarf='H';
        System.out.println(ilkHarf);//H

        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2);

        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //isminiz : Mehmet
        //soyisminiz : Bulutluoz
        //seklinde yazdirin

        String isim="Mehmet";
        String soyisim="Karakoç";

        System.out.println("İsminiz: "+isim);
        System.out.println("Soyisminiz: "+soyisim);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3=20;
        double sayi4=30;
        System.out.println(sayi3+sayi4); //50.0

        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        //5 – char data turunde bir variable olusturun ve yazdirin
        char ozelKarakter='#';
        System.out.println(ozelKarakter);
        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf); //117

        // ÖNEMLİ : char data türündeki değişkenler matematiksel işlemlerde kullanılırsa
        // o char değerinin ASCII karşılığı işleme alınır

         int sayi6='a';
        System.out.println(sayi6); //97




    }
}
