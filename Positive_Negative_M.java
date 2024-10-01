import java.util.Scanner;
public class Positive_Negative_M {
    public static String positiveNegativeNum(int n){
        if(n>=0){
            //System.out.println
            return("Number is positive");
            //return();
        }
        else if(n<0){
            //System.out.println
            return("Number is negative");
        }
        else{
            //System.out.println
            return("Number is zero");
        }
        // return();

    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter any number");
        int num = s.nextInt();
       System.out.println(positiveNegativeNum(num));
        
    }
}
