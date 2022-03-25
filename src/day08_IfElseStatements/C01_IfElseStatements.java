package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        // girilen bir karakterin harf oup olmadigini yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char chr=scan.next().charAt(0);

        if ((chr>='A'&&chr<='Z') || (chr>='a'&&chr<='z')){
            System.out.println("Girilen karakter bir harftir");
        }else{
            System.out.println("Girilen karakter bir harf degildir");
        }
    }
}
