package day35_inheritence;

public class Child01 extends Parent {
    public static void main(String[] args) {

        /*
        Child Class hic bir objeye ihtiyac duymadan
        Parent Class taki variable ye ulasabilir
         */

        System.out.println(isim); // Neval
        System.out.println(fabrika); // Yildiz Tekstil

        method1();
        method2();


    }
}
