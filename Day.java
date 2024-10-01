import java.util.Scanner;
//import java.util.Scanner;
class Day {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number in range (1 to 7): ");
    int n = s.nextInt();

    switch(n){
        case 1: System.out.println("Sunday");
                break;
        case 2: System.out.println("Monday");
                break
        case 3: System.out.println("Tuesday");
                break;
        case 2: System.out.println("Wednesday");
                break
        case 1: System.out.println("Thursday");
                break;
        case 2: System.out.println("Friday");
                break
        case 1: System.out.println("Satureday");
                break;
        default: System.out.println("Enter Valid Number in range (1 -7)");
                
    }



    
}
