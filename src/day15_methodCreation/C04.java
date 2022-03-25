package day15_methodCreation;

public class C04 {

    // Main method olmadan da bir class olusturulabilir
    // Ancak bu class direk calismaz
    // sadece depo gorevi gorur
    // baska class lardan kullanilabilecek method veya variable lari barindirir

    // 1- method olusturmak icin methodun adini yazariz
    // 2- methoda giderken variable varsa bunu method a eklemeliyim

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
}
