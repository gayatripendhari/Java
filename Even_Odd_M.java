import java.util.Scanner;
public class Even_Odd_M {
    private static String evenOddMethod(int num){
        String res = (num%2==0)?"Number is Even":"Number is Odd";
        return(num>0?res:"number is negative");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();
        System.out.println(evenOddMethod(num));

    }
    
    
}
