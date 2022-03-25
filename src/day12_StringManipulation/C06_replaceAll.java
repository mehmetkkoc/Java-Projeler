package day12_StringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        // kullanicidan isim soyisim bilgisini alip
        // butun harfleri * yapalim

        Scanner scanner = new Scanner(System.in);
        System.out.println(" isim soyisim giriniz");
        String isim = scanner.nextLine();

        System.out.println(isim.replaceAll("\\S","*"));
    }
}
