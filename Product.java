import java.util.Scanner;
class Product{
    public int id;
    public String title;
    public String description;
    public float price;
    public float sold;

    public Product(int id, String title,String description, float price , float sold){
        this.id=id;
        this.title=title;
        this.price = price;
        this.sold = sold;
    }
    public void printProperties(){
        System.out.println("ID: "+id);
        System.out.println("TITLE: "+title);
        System.out.println("DESCRIPTION: "+description);
        System.out.println("MRP: "+price);
        System.out.println("SOLDING PRICES: "+sold);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter information about your product...");
        System.out.println("Enter product Id: ");
        int id = s.nextInt();
        System.out.println("Enter product name: ");
        String title = s.next();
        System.out.println("Enter Description");
        String description = s.next();
        System.out.println("Enter Marketing Price: ");
        float price = s.nextFloat();
        System.out.println("Enter sold price: ");
        float sold = s.nextFloat();

        Product prod1 = new Product(id, title, description,price, sold);
        prod1.printProperties();



        
    }
}
