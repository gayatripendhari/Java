import java.util.Scanner;
public class Student {
    public static int  id ;
    public static String  clg_name;
    public static long mobile;
    public static String clg_email;

    public Student(int id, String name , long mobile , String email){
        Student.id = id;
        Student.clg_name = name;
        Student.mobile = mobile;
        Student.clg_email=email;
    }

    public Student(int id, String name){
        Student.id = id;
        Student.clg_name = name;
    }
    public void printStudent(int id, String name , long mobile , String email){
        System.out.println("ID:"+id);
        System.out.println("COLLEGE NAME:"+name);
        System.out.println("mobile:"+mobile);
        System.out.println("EMAIL:"+email);

    }

    public static void printStudent(int id, String name){
        System.out.println("ID:"+id);
        System.out.println("COLLEGE NAME:"+clg_name);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        String name = s.next();
        long mobile = s.nextLong();
        String email = s.next();
        printStudent(id, name, mobile, email);

    }

    
}
