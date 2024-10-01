import java.util.Scanner;
public class Array3_Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter any Number: ");
        for(int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum += a[i]; 
        }
        System.out.println("Sum: "+sum);
    }
}
