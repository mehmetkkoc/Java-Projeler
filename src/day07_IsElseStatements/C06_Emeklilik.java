package day07_IsElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin
        // 65 ve daha buyukse "emekli olabilirsin"
        // 65 alti ise "emekli olamazsiniz" yazdirsin

        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");

        byte yas= scan.nextByte();
        if (yas<=0){
            System.out.println("hatali giris yaptiniz");
        }else {
            if (yas >= 65) {
                    System.out.println("Emekli olabilirsiniz");
                }else{
                    System.out.println("emekli olamazsiniz");
                }
            }
        }
    }

