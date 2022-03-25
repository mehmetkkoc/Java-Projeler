package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {
        String str = "Ali";

        // Stringi yazdiran method
        // hosgeldiniz diyen bir method olustur
        // kapanma mesaji yazan bir method

        hosgeldinYazdir();
        //stringYazdir("Java gun gectikce guzellesiyor");
        //kapanmaMesaji();



    }

    public static void kapanmaMesaji() {
        System.out.println("Iy gunler dileriz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("boyle de olur");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMesaji();
    }
}
