package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        // Biz String methodlarini arka arkaya kullanabiliriz
        // Mesela 2. kelimenin ilk harfini kucuk yazdiralim

        // str.charAt(5) boyle yazdigimizda sonuc artik String degil char olacaktir
        // dolayisiyla Stringde yapmak istedigimiz tum degisiklikleri
        // once yapip sonra charAt() methodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));




    }
}
