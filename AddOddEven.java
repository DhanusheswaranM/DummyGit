import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class AddOddEven{
  public static void main(String args[]){
    try{
    File file = new File("input.txt");
    Scanner obj = new Scanner(file);
    System.out.println("Enter the size of the array : ");
    int size = obj.nextInt();
    int arr[] = new int[size];
    int odd = 0 ,even = 0;
    System.out.println("Enter the elements in tha array : ");
    for(int i= 0 ; i < size ; i++){
        arr[i] = obj.nextInt();
        if(arr[i]%2 == 0){
          even++;
        }
        else{
          odd++;
        }
    }
  System.out.println("Odd : "+odd+"\nEven : "+even);
    }catch(FileNotFoundException e){
      System.out.println("Error : File not found.");
      e.printStackTrace();
    }
  }
}
