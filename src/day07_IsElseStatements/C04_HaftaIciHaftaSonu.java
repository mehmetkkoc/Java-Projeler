package day07_IsElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");

        String gun= scan.next().toLowerCase(); // kullanici nasil yazarsa yazsin biz kucuk harfle degerlendiririz

        // String ifadelerde == kulanilmasi onerilmez
        // bekledigimizden farkli sonuc verebilir

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");
        }
        if (gun.equals("cumartesi")||gun.equals("pazar")){
            System.out.println("girdiginiz gun haftasonu");
        }
    }

}
