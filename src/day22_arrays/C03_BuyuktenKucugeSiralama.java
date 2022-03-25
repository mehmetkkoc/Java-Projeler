package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {

        // verilen bir array i buyukten kucuge siralayan bir method olustur

        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

        tersenSirala(arr);

        terstenSiralaYazdir(arr);




    }

    private static void tersenSirala(int[] arr) {
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");

        }System.out.println("");
    }
    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]= new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]= arr[arr.length-1-i] ;
        }
        System.out.println(Arrays.toString(tersArr));
    }
}
