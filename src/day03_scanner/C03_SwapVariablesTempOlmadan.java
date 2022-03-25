package day03_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {

        //Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
        //degistiren (SWAP) bir program yapiniz
        int sayi1=1;
        int sayi2=2;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("sayi1 "+sayi1+" sayi2 "+sayi2);
    }


}
