import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
public class Amicable {
	
	public static void main(String[] args) {
    try{
		File file3 = new File("inputAmicable.txt");
		Scanner obj= new Scanner (file3);
		System.out.println("Enter the number x :");
		int x = obj.nextInt();
		System.out.println("Enter the number y :");
		int y = obj.nextInt();
		int xsum = 0 , ysum = 0;
		if(x == 0 || y == 0) {
			System.out.println("false");
		}
		else {
			for(int i=1 ; i <= (x/2) ; i++) {
				if( x%i == 0) {
					xsum+=i;
				}
			}
			for(int i=1 ; i <= (y/2) ; i++) {
				if( y%i == 0) {
					ysum+=i;
				}
			}
			if( xsum == y && ysum == x ) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
    }catch(FileNotFoundException e){
      System.out.println("Error : File not found.");
      e.printStackTrace();
    }
  }
}
	
