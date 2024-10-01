public class Prime {
    public static void main(String[] args) {
        int num=72;
        int count =2;
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                count++;
            }
        }
        if (count==2) {
            System.out.println(num+"is a Prime Number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
