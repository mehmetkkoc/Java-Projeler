package Examples;

public class Examples3 {

    public static long examples3(int x){
        long y=x*(long) x;
        x=-1;
        return y;

    }

    public static void main(String[] args) {
        int value=9;
        long result=examples3(value);
        System.out.println(value);
    }
}
