package day06_Concatination_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);
        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;
        System.out.println(sonuc1);

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;

        System.out.println(sonuc2);

        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;

        System.out.println(sonuc3);

        // & ile && arasindaki fark && false secenegini gorunce islemi bitirir
        // & islemi davem ettirir. surec uzar

        int num=15;
        // num un 10 ile 20 arasinda oldugunu true diyerek dondurun
        // java 3 lu karsilastirma kabul etmez
        // 2 li karsilastirma yaparak mantiksal operatorlerle birlestirmeliyiz

        System.out.println(10<num && num<20);

        int num1=5;

        // num1 in 10 ile 20 arasinda olmadigini true olarak dondur


        System.out.println(num1<10 || num1>20);


    }
}
