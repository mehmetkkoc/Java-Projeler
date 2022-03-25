package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        //bu sayiyi 1 artirmak istersek

        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println(sayi);//12
        // eger 11 ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        // java 2 islemden once hangisini yapacagini bilmek ister

        System.out.println("pre-increment satirinda: "+ ++sayi); // 13 once artir sonra yazdir demek
        System.out.println("pre-incrementten sonra: "+sayi); // 13


        System.out.println("post-increment satirinda : "+ sayi++); //once yazdir sonra artir
        System.out.println("post-increment sonrasinda : " + sayi); // 14

    }
}
