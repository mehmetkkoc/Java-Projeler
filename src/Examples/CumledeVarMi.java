package Examples;

import java.util.Scanner;

public class CumledeVarMi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("bir harf giriniz");
        Character harf=scan.next().toLowerCase().charAt(0);

        if (cumle.indexOf(harf)==(-1)){
            System.out.println("harf yok");
            }else{
            System.out.println("harf var");
        }





    }
}
