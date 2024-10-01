import java.util.Scanner;
public class Largest_4_Num {
    public static void main(String[] args) {
        int  a, b,c,d;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();

        if(a>b && a>c && a>d){
            System.out.println(a+" is Largest number among all");
        }
        else if(b>c && b>d){
            System.out.println(b+" is Largest among all");
        }
        else if(c>d){
            System.out.println(c+" is largest among all");
        }
        else{
            System.out.println(d+" is largest among all");
        }
    }
}
