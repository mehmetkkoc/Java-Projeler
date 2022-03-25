package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        // bazen Ternary deki iki sonucun data turleri farkli olabilir
        // verilen sayi 100'den buyukse sayinin karesini alip yazdiran
        // 100 den kucukse "sayi 100 den buyuk olmali" yazdiran
        // bir ternary

        int sayi=120;

        //Ternary de ya sonucu dirak yazdirmaliyiz ya da bir deger atamaliyiz
        //eger sonuclar farkli data turlerine aitse
        //atama yapacagimiz variable in data turu tek olacagindan
        //atama yapamayiz
        // Sadece yazdirabiliriz

        System.out.println(sayi>100 ? sayi*sayi : "sayi 100 den buyuk olmali");
    }
}
