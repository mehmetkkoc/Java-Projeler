package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm= LocalTime.now();
        System.out.println(tm);

        // bir islemin ne kadar surede bittigini bulmak istersek islemden once ve sonra time objesi olusturarak farki alonir
        int sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi +=i;
        }
        LocalTime tmLoopSonrasi =LocalTime.now();
        System.out.println(tmLoopSonrasi);

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem "+(nano2-nano1)+" nanosaniyede bitti");

        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz


    }
}
