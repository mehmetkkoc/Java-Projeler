package day07_IsElseStatements;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Gun Ismi Giriniz");
        String gun= scan.next().toUpperCase();

        if (gun.equals("PAZAR") || gun.equals("CUMARTESI")){
            System.out.println("girilen gun haftasonudur");
        }else {
            System.out.println("girilen gun haftaicidir");
        }

    }
}
