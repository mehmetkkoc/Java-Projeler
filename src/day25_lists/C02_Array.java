package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        // verilen bir arrayden istenen elementi(kac tane varsa) silip kalanlari
        // yeni bir array olarak yazdiran yeni bir array olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyen=3;

        istenmeyenElementiSil(arr,istenmeyen);
    }

    private static void istenmeyenElementiSil(int[] arr, int istenmeyen) {
        // 1 - istenmeyen element sayisini bulalim
        
        int sayac=0;
        for(int i=0;i<arr.length;i++) {
            
            if (arr[i]==istenmeyen){
                sayac++;
            }
            
        }
        // 2 - yeni array olusturalim
        int arrYeni[]=new int[arr.length-sayac];
        
        // 3 - eski arraydan uygun elementleri yeniye tasi

        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!=istenmeyen){
                arrYeni[index]=arr[i];
                index++;
            }
            
        }

        // 4 - Listeyi yazdiralim

        System.out.println(Arrays.toString(arrYeni));


    }
}
