package day10_Switch_StringManipulation;

public class C04_CharAt {
    public static void main(String[] args) {

        // String de herhangi bir karakteri almak istedigimizde
        // o harfin indeksini kullanarak dtr.charAt(istenen index) yazabiliriz

        String str="Java Cok Guzel";

        // J yi yazdirmak icin
        System.out.println(str.charAt(0));

        // Gyi yazdirmak icin
        System.out.println(str.charAt(9));

        // va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3));

        // cOK seklinde yazdiralim
        System.out.println(""+str.toLowerCase().charAt(5)+
                            str.toUpperCase().charAt(6)+
                            str.toUpperCase().charAt(7));

        // son karakteri yazdir
        // str de 14 harf var, son harfin indexi 14-1 dir
        System.out.println(str.charAt(14-1)); // uzunluk -1



    }
}
