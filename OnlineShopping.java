import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
abstract class Product{
	private int productId ;
	private String productName ;
	private double price ;
	Product(int id , String name , double amount){
		productId = id ;
		productName = name ;
		price = amount ;
	}
	public int getProductId() {
		return productId ;
	}
	public String getProductName() {
		return productName ;
	}
	public double getPrice(){
		return price ;
	}
	public abstract void displayInfo();
}

class Electronics extends Product{
	private int Warranty ;
	Electronics (int id , String name , double amount , int Warranty){
		super(id , name , amount);
		this.Warranty = Warranty ;
	}
	public void displayInfo() {
			System.out.println("***Electronic product infromation***");
			System.out.println("ProductId : "+ getProductId());
			System.out.println("ProductName : "+getProductName());
			System.out.println("Price : "+getPrice());
			System.out.println("Warranty Period : "+this.Warranty);
		
	}
}

class Clothing extends Product{
	private char size ;
	private String material ;
	
	Clothing(int id , String name , double amount , char size , String material){
		super(id , name , amount);
		this.size = size ;
		this.material = material ;
	}
	public void displayInfo() {
		System.out.println("***Clothing product information***");
		System.out.println("ProductId : "+ getProductId());
		System.out.println("ProductName : "+getProductName());
		System.out.println("Price : "+getPrice());
		System.out.println("size : "+this.size);
		System.out.println("material : "+this.material);
}
}
class Electrical extends Product{
	private String brand ;
	private String color ;
	Electrical (int id , String name , double amount , String brand , String color){
		super(id , name , amount);
		this.brand = brand ;
		this.color = color ;
	}
	public void displayInfo() {
			System.out.println("***Electrical product information***");
			System.out.println("Name : "+getProductName());
			System.out.println("Id : "+ getProductId());
			System.out.println("Price : "+getPrice());
			System.out.println("Brand : "+this.brand);
			System.out.println("Colour : "+this.color);
	}
}
public class OnlineShopping {
	public static void main(String args[]) {
    try{
		int id,warranty;
        	String name , brand , color,  material ;
        	double amount ;
        	char size ;
		Scanner obj = new Scanner(System.in);
	    	
	    	System.out.println("***Enter the Electrical product information***");
	    
	    	System.out.println("Enter the id :");
	    	id = obj.nextInt();
	    	obj.nextLine();
	    	System.out.println("Enter the name of the product :");
	    	name = obj.nextLine();
	    	System.out.println("Enter the amount :");
	    	amount = obj.nextDouble();
	    	obj.nextLine();
	    	System.out.println("Enter the brand :");
	    	brand = obj.nextLine();
	    	System.out.println("Enter the color :");
	    	color = obj.nextLine();
	    	
		Electrical electrical = new Electrical(id , name , amount , brand , color);
		electrical.displayInfo();

	    	System.out.println("***Enter the Electronics product information***");
	    
	    	System.out.println("Enter the id :");
	    	id = obj.nextInt();
	    	obj.nextLine();
	    	System.out.println("Enter the name of the product :");
	    	name = obj.nextLine();
	    	System.out.println("Enter the amount :");
	    	amount = obj.nextDouble();
	    	System.out.println("Enter the Warranty :");
	    	warranty = obj.nextInt();
	    	
		Electronics electronics = new Electronics(id , name , amount , warranty);
		electronics.displayInfo();

	    	System.out.println("***Enter the Clothing product information***");
	    
	    	System.out.println("Enter the id :");
	    	id = obj.nextInt();
	    	obj.nextLine();
	    	System.out.println("Enter the name of the product :");
	    	name = obj.nextLine();
	    	System.out.println("Enter the amount :");
	    	amount = obj.nextDouble();
	    	obj.nextLine();
	    	System.out.println("Enter the size :");
	    	size = obj.next().charAt(0);
	    	obj.nextLine();
	    	System.out.println("Enter the material :");
	    	material = obj.nextLine();
		Clothing cloth = new Clothing(id , name , amount , size , material);
		cloth.displayInfo();

    }catch(FileNotFoundException e){
      System.out.println("Error : File not found.");
      e.printStackTrace();
    }
  }
}
