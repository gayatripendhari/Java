import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers you want to add? : ");
        int n = s.nextInt();
        switch (n) {
            case 2: System.out.println("Enter two numbers: ");
                    int a = s.nextInt();
                    int b = s.nextInt();
                    System.out.println("Sum of Two numbers is: "+sum(a, b));
                    break;

                case 3: System.out.println("Enter three numbers: ");
                        int p = s.nextInt();
                        int q = s.nextInt();
                        int r = s.nextInt();
                        System.out.println("Sum of Two numbers is: "+sum(p, q,r));
                        break;

            case 4: System.out.println("Enter four numbers: ");
                    int e = s.nextInt();
                    int f = s.nextInt();
                    int g = s.nextInt();
                    int h = s.nextInt();
                    System.out.println("Sum of Two numbers is: "+sum(e,f,g,h));
                    break;
        }

    }

        public static int sum(int a,int b){
            return a+b;
        }
        public static int sum(int a , int b , int c){
            return a+b+c;
        }
        public static int sum(int a , int b, int c , int d){
            return a+b+c+d;
        }

    
}
