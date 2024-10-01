import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        int hour;
        Scanner s = new Scanner(System.in);
        hour = s.nextInt();
         
        if (hour>=5 && hour<=11) {
            System.out.println("Good Morning");
            
        }
        else if(hour>=12 && hour<=16)
        {
            System.out.println("Good Afternoon");
        }
        else if(hour>=17 && hour<=20){
            System.out.println("Good Evening");
        }
        else if(hour>21 && hour<24 || hour>=0 && hour<=4){
            System.out.println("GOod Night");
        }
        else{
            System.out.println("Invalid NUmber");
        }

    }    
}
