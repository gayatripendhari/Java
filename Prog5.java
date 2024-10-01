import java.util.Scanner;
class Prog5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements do you want to add>: ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Sum of Even Elements in given array is: "+ sumOfEven(a));
    }
    public static int sumOfEven(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sum += a[i];
            }
        }
        return(sum);
    }
    
}
