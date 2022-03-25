package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {


        int arr[][] = {{3, 1, 7}, {6, 10, 2}};

        System.out.println(arr[0][2]); //7
        System.out.println(arr[1][1]); //10

        // ilk inner array in tum elementlerini yazdir

        System.out.println(arr[0]); // bir array oldugundan direkt yazdirilamaz
        System.out.println(Arrays.toString(arr[0])); // [3,1,7]

        System.out.println(Arrays.toString(arr)); // [[I@1b28cdfa, [I@eed1f14] herbir array in referansini yazdirir

        System.out.println(Arrays.deepToString(arr)); // [[3, 1, 7], [6, 10, 2]] tum array i yazdirir




    }
}