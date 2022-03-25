package day12_StringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // mehmet@gmail.com.tr

        String email="mehmet@tmail.com";
        String aranan="@gmail.com";

        if (!email.contains(aranan)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.lastIndexOf(aranan)==email.length()-10){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }


    }
}
