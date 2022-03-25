package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_IstenmeyenElementiSilme {
    public static void main(String[] args) {
        // verilen bir arrayden istenen elementi(kac tane varsa) silip kalanlari
        // yeni bir array olarak yazdiran yeni bir array olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyen=3;

        istenmeyenElementiCikar(arr,istenmeyen);
    }

    private static void istenmeyenElementiCikar(int[] arr, int istenmeyen) {
        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyen){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
