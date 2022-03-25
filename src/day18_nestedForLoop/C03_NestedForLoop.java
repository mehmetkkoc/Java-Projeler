package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {


        // Kullanicidan bir pozitif rakam aliniz asagidaki sekli olustur
        // *
        // **
        // ***
        // ****

        int input = 5;

        for (int i = 0; i <= input; i++) {
            for (int j = 1; j <=i ; j++) {
                // nested for Loop ya dikdortgen veya ucgen formatinda olabilir
                // dikdortgen istedigimizde iki loop icin de bagimsiz endpoint belirleriz
                // ucgen sekli vermek icin inner loop un endpointi outer degiskene baglariz
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
