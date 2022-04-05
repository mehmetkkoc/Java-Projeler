package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh= LocalDate.now(); // objenin olusturuldugu tarihi trh2ye atar
        LocalDate baskaTrh=LocalDate.of(1984,4,3);
        // istedigimiz yil, ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh); // 2022-04-02
        System.out.println(trh.getDayOfMonth()); // 02
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getYear());


        // bir tarihten istedigimiz kadar geri ve ileri gidebiliriz

        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.minusWeeks(5).minusDays(3));
        System.out.println(trh.plusMonths(9).plusDays(10));

        // istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);

        // is ile baslayan methodlar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(baskaTrh));




    }


}

