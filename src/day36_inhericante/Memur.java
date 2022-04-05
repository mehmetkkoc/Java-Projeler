package day36_inhericante;

public class Memur extends Muhasebe{



    public static void main(String[] args) {

        Memur memur1 =new Memur();
        // Memur objesi Memur class inin objesi olmasina ragmen
        //inherit ettigi Muhasebe ve Personel classlarindaki
        // tum datalari alabilir

        //Personel Class indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3123563214";

        // Muhasebe Class indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";

        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=15;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2); // deger atanmamislara default deger atar



    }


    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
