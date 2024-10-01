package Programming;

import java.util.Scanner;

class LargestNum {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in); 

        //int num1 , num2;
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        
        if(num1>num2)
        {
            System.out.println("Num1 is Greater " + num1);
        }
        else
        {
            System.out.println("Num2 is Greater " + num2);
        }
    }
}
    

