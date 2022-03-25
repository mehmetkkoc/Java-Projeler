package day07_IsElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        if (a<b && b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");

        }
        if (a>0) System.out.println("suslu parantez olmazsa sadece 1 satir calisir");

        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if boy sini {} icine yazmalisiniz
        // body i {} icine yazmazsak ta if cumlesi calisir
        // ancak ilk ; gordugunde if cumlesi bitmis olur


        // 22. satirdaki kod 13. satirdaki if True olsada False olsa da calisir
        System.out.println("2. satir da calisti");
    }
}
