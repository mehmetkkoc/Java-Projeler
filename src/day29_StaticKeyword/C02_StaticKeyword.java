package day29_StaticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        // baska class taki static class uyelerine
        // ulasabilmek icin sadece classIsmi.staticUyeIsmi
        // yazmamiz yeterlidir

        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="3212354876";
        System.out.println(C01_Static.okulTelefonu);

        // Baska class'daki static olamayan class uyelerine
        // ancak o class'dan obje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece o obje icin gecerli olur
        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();
        System.out.println(obj2.okulIsmi); // Yildiz Koleji
        obj2.okulIsmi="SAbir Koleji";
        System.out.println(obj1.okulIsmi); // Yildiz Koleji

    }
}
