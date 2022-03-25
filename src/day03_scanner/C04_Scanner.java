package day03_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Scanner kullanmak için 3 adım takip ediyoruz
        // 1. adım : kendimize bir Scanner oluşturmak
        Scanner scan=new Scanner(System.in); // eşitliğin sağında yeni bir scanner oluşturulur.
                                             // ve oluşturulan bu scanner scan variable'na assing edilir
                                             // scan vaariable ismidir, istediğimiz ismi verebiliriz

        // 2. adım : Kullanıcıdan istediğiniz değeri girmesi için bir mesaj yaz
        System.out.println("Lütfen isminizi giriniz");
        // 3. adım : Kullanıcının girdiği değeri uygun bir variable oluşturup kaydedin
        String isim= scan.next(); // scan.next SADECE ilk kelimeyi alır (İlk SPACE kadar olan)
        System.out.println("Kullanıcının girdiği isim: "+ isim);
    }
}
