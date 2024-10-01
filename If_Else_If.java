public class If_Else_If {
    public static void main(String[] args) {
        int percetage = 56;
        if (percetage >= 35 && percetage <= 45) {
            System.out.println("PASS");
        }
        else if (percetage > 45 && percetage < 60) {
            System.out.println("Second Class");
        }
        else if(percetage >= 60 && percetage <= 80){
            System.out.println("first class");
        }
        else if (percetage >= 0 && percetage < 35) {
            System.out.println("Fail");
            
        }
        else{
            System.out.println("Please, Enter valid percentage.");
        }
    }
}
