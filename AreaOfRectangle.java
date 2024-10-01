import java.util.Scanner;
public class AreaOfRectangle {
    private static double areaOfRectangle(double l , double w){
        double area = l*w;
        return (area);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter length:");
            double l  =  s.nextDouble();
            System.out.println("Enter width: ");
            double w = s.nextDouble();
            System.out.println(areaOfRectangle(l, w));
    }
}
