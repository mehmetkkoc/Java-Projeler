package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        int input = 12;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <=i ; j++) {
                // nested for Loop ya dikdortgen veya ucgen formatinda olabilir
                // dikdortgen istedigimizde iki loop icin de bagimsiz endpoint belirleriz
                // ucgen sekli vermek icin inner loop un endpointi outer degiskene baglariz
                System.out.print("* ");

            }
            System.out.println("");
        }

        for (int i = 1; i <= input-1; i++) {
            for (int j = 1; j <=input-i ; j++) {
                // nested for Loop ya dikdortgen veya ucgen formatinda olabilir
                // dikdortgen istedigimizde iki loop icin de bagimsiz endpoint belirleriz
                // ucgen sekli vermek icin inner loop un endpointi outer degiskene baglariz
                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}
