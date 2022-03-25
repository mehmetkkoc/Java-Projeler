package day10_Switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        // kullanicidan sayi olarak ay numarasi alip
        // istenilen ay ismini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu yazin");
        int ayNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine switch - case yapisini kullanabiliriz

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agostos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;

            default:
                System.out.println("lutfen gecerli bir ay no yaziniz");

                // switch icine yazilan variable'in degerine gore
                // ilgili case'i bulur ve break gorene kadar kodu calistirir
                // eger break yoksa ilgili case'den asagi dogru tum case'ler calisir
                // if else'deki son else gibi, geriye kalan durumlari tamamen
                // kapsayacak bir satir daha ekleyebiliriz

        }


    }
}