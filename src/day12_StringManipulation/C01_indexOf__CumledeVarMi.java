package day12_StringManipulation;

import java.util.Scanner;

public class C01_indexOf__CumledeVarMi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next().toLowerCase();
        int ilkIndex=cumle.indexOf(kelime);
        if (cumle.indexOf(kelime)==(-1)){
            System.out.println("yok");
        }else if(cumle.indexOf(kelime,ilkIndex+1)==(-1)) {
            System.out.println("1 ad var");

        }else{
            System.out.println("1 den fazla var");
        }

    }

}
