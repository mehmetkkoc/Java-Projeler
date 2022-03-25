package day11_StringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {
        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse cevabini ve "derse katiliminiz alinmistir
        // hsyir derse cevabini ve "Sonraki dersimiz bekleriz" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz? \n Evet veya Hayir yaziniz");

        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz "+cevap+" derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz "+cevap+" sonraki dersimize bekleriz");
        }

    }
}
