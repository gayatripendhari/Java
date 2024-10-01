import java.util.Scanner;
public class AreaOfSquare {
    private  static double areaOfSquare(double a){
        double area = a*a;
        return(area);
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side of a sqaure: ");
        double a = s.nextDouble();
        System.out.println(areaOfSquare(a));
    }
}
