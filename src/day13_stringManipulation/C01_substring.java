package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));
        // yukaridaki String i kullanarak Mehmet Hoca ile IT cok guzel yazdir

        System.out.println(str.replace("Java","Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5) );

        System.out.println(str.substring(9)); // yazilan index inclusive(dahil)

        // eger bir indexten sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekir str.substring(baslangicIndexi, bitisIndexi)
        // baslangic indexi ==> inclusive(dahil)
        // bitis indexi     ==> exclusive(haric)

        System.out.println(str.substring(0,4)); // Java
        System.out.println(str.substring(0,1)); // J

        String harf=str.substring(5,6);
        System.out.println(harf); // 5. index 6. harf "i"

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7)); // soldan saga dogru okudugu icin hic birsey yazdirmaz

        // System.out.println(str.substring(5,2)); // bitis index i baslangic index inden kucuk olamaz

        System.out.println(str.substring(str.length()-1)); // son harfi verir
        System.out.println(str.substring(str.length()-5)); // son 5 harfi
        System.out.println(str.substring(str.length())); // oyle bir index olmadigindan sonuc hiclik olur










    }
}
