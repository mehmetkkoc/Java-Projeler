package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

       /* Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir
        program yaziniz

        Orn : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
                sayi1=20 ve sayi2=10
                */
        int sayi1=10;
        int sayi2=20;
        System.out.println("Swaptan önce sayi1: "+sayi1+" sayi2: "+sayi2);
        int temp;
        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("Swaptan sonra sayi1: "+ sayi1+ " sayi2:"+sayi2);






    }
}
