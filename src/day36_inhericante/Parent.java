package day36_inhericante;

public class Parent {
    protected Parent(){
        System.out.println("Parent parametresiz Cons. Calisti");
    }

    protected Parent(int sayi3, int sayi4){
        System.out.println("Parent 2 parametreli cons.");
    }

    protected int sayi;
}
