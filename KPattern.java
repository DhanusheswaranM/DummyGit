import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
public class KPattern {
	public static void main(String args[]) {
		try{
 		File file1 = new File("inputk.txt");
		Scanner obj = new Scanner (file1);
		int n = obj.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = n ; j > i ; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i = 1 ; i < n ; i++ ) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		}catch(FileNotFoundException e){
			System.out.println("Error : File not found.");
			e.printStackTrace();
		}
	}
}
