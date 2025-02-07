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
		Scanner obj = new Scanner(System.in);
		
		Electrical electrical = new Electrical(22, "LED bub" , 120.5 , "philips" , "Yellow");
		electrical.displayInfo();

		Electronics electronics = new Electronics(22, "Smart TV" , 80000 , 5);
		electronics.displayInfo();
		
		Clothing cloth = new Clothing(25 , "PeterEngland" , 2500 , 'M' , "Cotton");
		cloth.displayInfo();

    }catch(FileNotFoundException e){
      System.out.println("Error : File not found.");
      e.printStackTrace();
    }
  }
}
