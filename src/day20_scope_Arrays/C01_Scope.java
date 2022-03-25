package day20_scope_Arrays;

public class C01_Scope {

    int sayi;
    String okulIsmi="Yildiz Koleji";
    boolean okulAcikMi;

    public static void main(String[] args) {

        // sayi=10;   sayi variable i static olmadigi icin main methoddan direk kullanilmaz
        // instance variable lara static methodlardan ulasabilmek icin obje olusturmamiz gerekir


        C01_Scope obj = new C01_Scope();
    }
}
