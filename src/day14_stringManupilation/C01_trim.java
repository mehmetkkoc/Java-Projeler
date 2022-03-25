package day14_stringManupilation;

public class C01_trim {
    public static void main(String[] args) {

        String str="   siz ne derseniz deyin, Java bildigini okur.   ";

        str.trim();
        System.out.println(str); // bosluklu yazdirir
        System.out.println(str.length()); // 49

        str=str.trim();
        System.out.println(str); // bosluksuz yazdirii
        System.out.println(str.length()); //43
    }
}
