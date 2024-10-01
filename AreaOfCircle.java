import java.util.Scanner;
public class AreaOfCircle {
    private static double areaOfCircle(double r){
        double area = 3.14 * r*r;
        return(area);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius in cm: ");
        double r = s.nextDouble();
        System.out.println(areaOfCircle(r));
    }
}
