package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim     =   "mehmet kemal";
        String soyisim  =   "karakoc";
        String kKNo     =   "4562145796321457";

        // Eger bir methoddan bir islem yapmasini ve yaptigi islemin bize getirmesini isterseniz
        // return type void degil bize getirecegi data turunde olmalidir


        String gizlenmisIsimSoyisim=isimSoyisimGizle(isim,soyisim);
        // bana isim ve soyisimin gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur

        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmiskkNo=krediKartiGizle(kKNo);
        System.out.println(gizlenmiskkNo);



    }

    public static String krediKartiGizle(String kKNo) {
        String yeniKKNo =   "**** **** **** " + kKNo.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {

        String yeniisim =   isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoy  =   soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S","*");
        // method olusturmada 3. adim
        // method calisinca sadece birsey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna karar verilir
        // Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        // return Type' i void degil String sectik
        // ve method"un sonuna return edilecek datayi yazdik

        return yeniisim+" "+yeniSoy;
    }
}
