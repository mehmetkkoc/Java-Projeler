package day07_IsElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {
        int a=2;
        int b=3;

        if (a==b){
            System.out.println("verilen sayilar esittir");
        }
        if (a<100){
            System.out.println("a 100 den kucuktur");

        }
        if (a*b>5){
            System.out.println("sayilarin carpimi 5 ten buyuk");
        }
        // badimsiz if cumleleri kendilerinden baska sartla ilgilenmez
        // bir sart ve o sarta bagli sonuca odaklanir
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin body si calisabilecegi gibi
        // hicbirinin body si de calismayabilir

    }
}
