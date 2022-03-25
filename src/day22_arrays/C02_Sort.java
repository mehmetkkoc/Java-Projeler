package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

        // sort methodu olmadan yapalim

        int enKucukSayi=Integer.MAX_VALUE;
        int enBuyukSayi=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];

            }
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }

        }
        System.out.println("Array deki en kucuk sayi : "+enKucukSayi+"\nArray deki en buyuk sayi : "+enBuyukSayi);

        // sort ile yapalim

        Arrays.sort(arr);
        System.out.println("Array deki en kucuk sayi : "+arr[0] + "\nArray deki en buyuk sayi : "+arr[arr.length-1]);

    }


}