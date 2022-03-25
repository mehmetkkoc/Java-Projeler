package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data turu ile nonPrimitive arasindaki farklar?
        String str="Java";
        int num=10;

        System.out.println(str.toUpperCase()); //JAVA

        System.out.println(str); //Java

        // non-primitive data turleri data depolamak yaninda bircok faydali method a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklar(container)
        // primitive data turleri icin de bazi method lar gerekli oldugunda
        // Java ara bir cozum uretmistir
        // Java her bir primitive data turunu non-primitive olarak kullanabilmek icin ozel claslar olusturmus
        // ve bunlara Wrapper Class adini vermistir

        double num2=20.5;

        // num2 primitive oldugundan num2. yazinca hicbir method gelmez

        Double num3=15.2;

        // num3 Wrapper Class olan Double class ini kullandigindan
        // num3. yazinca bircok method gelir




    }
}
