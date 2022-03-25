package day14_stringManupilation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {

        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //  String str1 = “$13.99”
        //  String str2 = “$10.55”
        //  ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 ="$13.99";
        String str2 ="$10.55";

        str1 = str1.replaceAll("\\D","");
        str2 = str2.replaceAll("\\D","");

        double str1S=Double.valueOf(str1);
        double str2S=Double.valueOf(str2);

        double sonuc=(str1S+str2S)/100;
        System.out.println("verilen sayilarin toplami : $" + sonuc);



    }
}
