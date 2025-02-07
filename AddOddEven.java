import java.io.File;
import java.util.*;
public class AddOddEven{
  public static void main(String args[]){
    File file = new File("input.txt");
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int size = obj.nextInt();
    int arr[] = new int[size];
    int odd = 0 ,even = 0;
    System.lut.println("Enter the elements in tha array : ");
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
  }
}
