package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // iki variable nin degerlerini toplayan bir method olusturun
        // 1- method adini yazalim
        // 2- methoda gondermem gereken arguman var mi

        ikiSayiTopla(a,b);
        ikiSayiTopla(25,50);
        C04.dortHarfiTersineCevir("sema");


    }

    // bir methodu olusturmak calismasi icin yeterli degildir
    // method ancak cagirilirsa calisir
    // ayni class veya farkli class ta olmasinin hicbir onemi yoktur
    // Java main method da yukaridan asagiya dogru calisir
    // ve geldigi satiri calistirir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("Verilen 2 sayinin toplami : "+(a+b));

    }
}
