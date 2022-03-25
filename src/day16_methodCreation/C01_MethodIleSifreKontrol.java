package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        //  bu 4 kontrolu method ile yapin

        String sifre="Dfgfdasdf";
        boolean ilkHarf = ilkHarfKontrolEt(sifre);
        boolean sonHarf = sonHarfKontrolEt(sifre);
        boolean bosluk = boslukKontrolEt(sifre);
        boolean uzunluk = uzunlukKontrolEt(sifre);

        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }else{
            System.out.println("Hatali Giris");
        }


    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukK = false;
        if (sifre.length() >= 8) {
            uzunlukK = true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
            uzunlukK = false;
        }return uzunlukK;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukK = false;
        if (!sifre.contains(" ")) {
            boslukK = true;
        } else {
            System.out.println("sifre bosluk icermemeli");
            boslukK=false;
        }return boslukK;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfK = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonHarfK = true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
            sonHarfK=false;
        }return sonHarfK;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        boolean ilkHarfK = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarfK = true;
        } else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
            ilkHarfK=false;
        }return ilkHarfK;
    }
}
