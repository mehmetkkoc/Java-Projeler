package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        // az ise "az sonuc bulundu"

        String str= "1-48 of 104 results for \"nutella\"";

        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);
        String aramaSonucStr=str.substring(ikinciSpace+1,ucuncuSpace);
        int aramaSonucInt=Integer.valueOf(aramaSonucStr);

        System.out.println(aramaSonucInt>100 ? "super" : "az sonuc bulundu" );



    }
}
