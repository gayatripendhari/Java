import java.util.Scanner;
public class AreaOfTriangle {
    private  static double areaOfTriangle(double b , double h){
        double area = 0.5 * b*h;
        return(area);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Base of Triangle: ");
        double b = s.nextDouble();
        System.out.println("Enter Perpendicular Height of trisngle: ");
        double h = s.nextDouble();
        System.out.println(areaOfTriangle(b, h));
    }
}
