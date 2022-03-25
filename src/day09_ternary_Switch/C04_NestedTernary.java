package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // verilen sayinin pozitif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif ise tek mi cift mi
        // negatifse -100 den buyuk ya da kucuk

        int sayi=-125;

        System.out.println(sayi>=0 ? (sayi%2==0 ? "pozitif cift" : "pozitif tek") : (sayi>=-100 ? "negatif -100 den buyuk" : "negatif -100 den kucuk"));

    }
}
