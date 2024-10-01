import java.util.Scanner;
class Prog7{
    public int id;
    public String title;
    public String description ;
    public float price;
    public float sold_p;

    public Prog7(int id , String title){
        this.id = id;
        this.title = title;
    }

    public Prog7(int id , String title, String description, float price, float sold_p){
        this(id,title);
        //this.title = title;
        this.description = description;
        this.price = price;
        this.sold_p=sold_p;
    }

    public void printProduct(int id , String title){
        System.out.println("ID: "+this.id);
        System.out.println("TITLE: "+this.title);
    }

    public void descProduct(int id , String title, String description, float price, float sold_p){
        System.out.println("ID: "+this.id);
        System.out.println("TITLE: "+this.title);
        System.out.println("DESCRIPTION: "+this.description);
        System.out.println("PRICE: "+this.price);
        System.out.println("SOLDING PRICE: "+this.sold_p);
    }
    public static void main(String[] args){
        System.out.println("Enter Your product details{ID,TITLE,DESCRIPTION,PRICE,SOLDING PRICE}: ");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        String title = s.next();
        String description = s.next();
        float price = s.nextFloat();
        float sold_p = s.nextFloat();
        s.close();
        System.out.println("Product Details: ");
        System.out.println("descProduct Method called............");
        Prog7 product1 = new Prog7(id,title,description,price,sold_p);
        product1.descProduct(id, title, description, price, sold_p);
        System.out.println("Constuctor2 invoked");
        product1.printProduct(id, title);

       /*System.out.println("printProduct Method Called........");
        Prog7 product2 = new Prog7(id,title);
        product2.printProduct(id, title);
      */


    }

}