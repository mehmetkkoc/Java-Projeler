package day14_stringManupilation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        String isim     =   "mehmet";
        String soyisim  =   "karakoc";
        String kKNo     =   "4562145796321457";

        String isimYeni= isim.substring(0,1).toUpperCase() +
                        isim.substring(1,isim.length()).replaceAll("\\S","*");
        String soyYeni= soyisim.substring(0,1).toUpperCase() +
                        soyisim.substring(1,soyisim.length()).replaceAll("\\S","*");
        String kKNoYeni= "**** **** **** "+kKNo.substring(kKNo.length()-4);
        System.out.println("isim soyisim : "+isimYeni+" "+soyYeni+"\nkart no : "+kKNoYeni);




    }
}
