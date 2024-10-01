import java.util.Scanner;

public class Day_M {
    private static int numberOfDays(String month){
        switch (month) {
            case "february":return(28);

            case "april":
            case "jun":
            case "september" :
            case "november" : return(30);
           // break;

            case "january":
            case "march":
            case "may":
            case "july":
            case "auguest":
            case "octumber":
            case "december": return(31);
            // break;
        
            default: System.out.println("Invalid Month!");
                break;
        }
        return 0;
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name of Month: ");
        String month = s.next().toLowerCase();

        System.out.println(numberOfDays(month));
    }
}
