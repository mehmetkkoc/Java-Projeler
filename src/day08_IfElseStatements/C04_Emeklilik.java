package day08_IfElseStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir
        Scanner scan=new Scanner(System.in);
        System.out.println("Cinsiyet ? \nK/E");
        char cins=scan.next().toUpperCase().charAt(0);
        System.out.println("Yas ? ");

        short yas= scan.nextShort();
        if (cins=='E') {
            if (yas < 0 || yas > 125) {
                System.out.println("Gecersiz veri");
            } else if (yas <= 65) {
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        }else if (cins=='K'){
            if (yas < 0 || yas > 125){
                System.out.println("gecersiz vero");
            }else if (yas<=60){
                System.out.println("emekli olamazsiniz");
            }else {
                System.out.println("emekli olabilinir");
            }
        }else {
            System.out.println("Hatali Cinsiyet Girisi");
        }

    }
}
