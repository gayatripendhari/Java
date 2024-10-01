public class Datatype_p5 {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        boolean res1 = (a > b) || (a < b);
        boolean res2 = (a >= b) && (a <= b);
        boolean res3 = (a == b) && (a != b);
        System.out.println(res1);//true
        System.out.println(res2);//false
        System.out.println(res3);//false
    }
}
