package day40_overriding_polymorphyism;

public class C02 extends C01{

    private void method4() {
        System.out.println("Parent method4");
        /* Parent classtaki private method4 e
        Child class dan ulasmamiz mumkun olmadigi icin
        Java bu iki methodu
        tamamen farkli iki method olarak kabul eder
        @Override kullanmak istersek java CTE verir
         */

    }
    @Override
    protected String method3() {
        // Covariant icin olusturuldu
        return "parent method3";
    }

    @Override
    /*
    @Override notasyonu ovirriden method ile overriding methodu
    birbirine baglar
    Farkinda olmadan overriden method silinirse veya signature degistirilirse
    bu iliski bozulacagi icin Java CTE verir

    Notasyon kullanilmazsa Java bunlarin iliskisini bilir ama
    overrriden method silinirse sesini cikarmaz
     */

    public void method2() {
        System.out.println("child method2");
    }

    public static void main(String[] args) {

        C02 obj = new C02();
        obj.method1(); // parent method1
        obj.method2(); // child method2

        C01 obj2 = new C02();
        obj2.method1(); // parent method1
        obj2.method2(); // child method2

        C01 obj3 = new C01();
        obj3.method1(); // parent method1
        obj3.method2(); // parent method1

    }
}
