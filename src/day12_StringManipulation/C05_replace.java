package day12_StringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        // bu cumledeki bosluk disindaki karakter sayisini bulun

        System.out.println("space haric karakter sayisi : " + str.replace(" ","").length());

        //atama yapilmadigi surece orjinal String kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal metin karakter sayisi : " + str.length());

        // str da kalici degisiklik yapalim
        // Bugun yerine Yarin
        //ogrendik yerine ogrenecegiz

        str = str.replace("Bugun","Yarin");
        str = str.replace("ogrendik","ogrenecegiz");
        System.out.println("degisiklikten sonra metin : " + str);

        str.replace("ne cok","ne az");

        System.out.println(str); // atama yoksa degisiklik yok


    }
}
