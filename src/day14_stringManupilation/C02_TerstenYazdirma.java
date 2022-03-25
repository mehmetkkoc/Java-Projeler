package day14_stringManupilation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {


        // 4 harfli bir kelime gir
        // tersten yazdir

        String input = "Mavi";

        String tersten = input.substring(3) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);
        System.out.println(tersten);
    }
}
