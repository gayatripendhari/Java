public class Compound_Op {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        System.out.println(a);//10
        a += b;
        System.out.println(a); //15

        a -= b;
        System.out.println(a);//10

        a *= b;
        System.out.println(a);//50

        a /= b;
        System.out.println(a); //10

        a %= b;
        System.out.println(a); //0
    }
}

