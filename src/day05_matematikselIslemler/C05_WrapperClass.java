package day05_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        short num1=20;
        Short num2=30;
        num1=num2; // Wrapper Class ile ayni isimdeki primitive data turu arasinda gecis olabilir

        System.out.println(num1); //30
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.BYTES); // 2 Byte=16 Bit

     }
}



