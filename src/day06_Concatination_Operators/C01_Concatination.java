package day06_Concatination_Operators;

public class C01_Concatination {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzel";
        int num1=5;
        int num2=3;

        //Java5Guzel
        System.out.println(str1+num1+str2);

        //2Guzel15
        System.out.println(num1-num2+str2+num1*num2);

        //Java22
        System.out.println(str1+(num1-num2)+(num1-num2));

        //53Guzel
        System.out.println(""+num1+num2+str2);
        /*
        eger tamamen sayilardan olusan bir String varsa ve int e cevirmek istersek
        Integer.valueOf(str)
        bir sayiyi String e cevirmek istersem
        ""+sayi
         */

    }
}
