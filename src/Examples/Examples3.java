package Examples;

import java.util.Scanner;

public class Examples3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Gunun haftadaki sirasini girin");

        String gun=scan.next().toLowerCase();

        switch(gun){
            case "pazartesi", "sali", "carsamba", "persembe", "cuma": System.out.println("H.ici");
            break;
            case "cumartesi", "pazar": System.out.println("H.sonu");
            break;
            /*case 3: System.out.println("car");
            break;
            case 4: System.out.println("per");
            break;
            case 5: System.out.println("cum");
            break;
            case 6: System.out.println("cts");
            break;
            case 7: System.out.println("pzr");
            break;*/
            default: System.out.println("sallama");

        }


    }
}
