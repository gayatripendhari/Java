import java.util.Scanner;
class Student2 {
    public int  id ;
    public String  name;
    public long mobile;
    public String email;

    public Student2(int id){
        this.id = id;
    }

    public Student2(int id, String name){
            this(id);
            this.name = name;
    }
    public Student2(int id, String name , long mobile , String email){
        this(id,name);
        //this(name);
            this.mobile = mobile;
            this.email=email;
    }

    public void printStudent(int id, String name , long mobile , String email){
       // System.out.println();

        System.out.println("ID:"+this.id);
        System.out.println("COLLEGE NAME:"+this.name);
        System.out.println("mobile:"+this.mobile);
        System.out.println("EMAIL:"+this.email);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student details in sequence {id,name,mobile ,email}: ");
        int id = s.nextInt();
        String name = s.next();
        long mobile = s.nextLong();
        String email = s.next();
        s.close();
        Student stud1=new Student(id, name, mobile, email);
        System.out.println("Student deatails: ");
        stud1.printStudent(id, name, mobile, email);

    }

    
}
