package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {

        Cons01 obj1 = new Cons01(); // default constructor devrede
        // Cons01 Class inda hic contructor olusturmazsak, Java default constructor i kullandigindan
        //obj1 i uretebildik
        // Ancak biz parametreli veya parametresiz bir constructor yazdigimizda
        //Java default constructor i siler
        // Dolayisiyla biz herhangi bir constructor olusturdugumuzda
        // daha once baska claslar veya kullanicilarin
        // olusturmus oldugu objeleri kullanabilmeleri icin parametreli constructordan sonra
        // bir de parametresiz constructor olusturmaliyiz


        Cons01 obj2 = new Cons01("Java");
    }
}
