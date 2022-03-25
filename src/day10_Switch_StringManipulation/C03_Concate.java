package day10_Switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // Concatination yapmak istersek 2 ihtimal var
        // daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya String classindan gelen concat methodunu ekleyebiliriz

        String str1 ="Java";
        String str2 ="Candir";

        // Java Candir yazdir

        System.out.println(str1 + " " + str2);

        String cumle=str1.concat(str2);
        System.out.println(cumle);
        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);



    }
}
