package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda girdigi tum sayilarin toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        while(sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);

        // baslangic, bitis ve degisim degerleri nek olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan while loop daha avantajlidir
    }
}
