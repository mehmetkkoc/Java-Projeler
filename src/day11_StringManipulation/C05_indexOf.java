package day11_StringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str="Java bir baska guzel valla cok guzel";

        // istersek char olarak verdigimiz bir harfin indexini bize dondurur

        System.out.println(str.indexOf('J')); // 0
        // istersek bir harf ya da metin olarak verdigimiz String'in indexini dondurur

        System.out.println(str.indexOf("l")); //19
        System.out.println(str.length()-1);//35
        System.out.println(str.indexOf("aska")); //10

        // ayni harften 1 den fazla varsa?
        System.out.println(str.indexOf("b"));// buldugu ilk dogru eslesmenin indexini dondurur


        System.out.println(str.indexOf('b', 5));

        //bu methodda java aramaya fromIndex olarak yazdigimiz karakterden itibaren sayar

        // verilen Stringdeki ikinci a harfinin index ini bulalim
        int ilkindex=str.indexOf('a');
        System.out.println(str.indexOf('a',ilkindex+1)); // 3

        // verilen Stringdeki ikinci a harfinin index ini bulalim
        int ilkbindex=str.indexOf("b");
        System.out.println(str.indexOf("b",ilkbindex+1)); // 9

        //20. indexten sonra guzel aratalim
        System.out.println(str.indexOf("guzel", 20));

        // Stringde olmayan bir harf aratsak

        System.out.println(str.indexOf("y")); // y yok demesi lazim ama return type i index
                                                // yok demenin sayisal karsiligi olarak -1 i tercih etmistir

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("mail adresinizi girin");
        String mail= scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");
        }

        // OZET : indexOf method'u icierise yazilan String veya char'in
        // metinde hangi index'de oldugu bize dondurur
        // eger aradigimiz metin veya char yoksa , olmadiginin delili olarak
        // bize -1 dondurur


    }
}
