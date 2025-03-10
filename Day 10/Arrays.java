
import java.util.Scanner;

public class Arrays{

public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);

  // int arr[] = new int[5];
  
  // System.out.println("Enter your items : ");
  // for(int i = 0; i < arr.length ; i++){
 
  //   if(i == 3){
  //     continue;
  //   }
  //   arr[i] = scan.nextInt();

  // }

  int arr[] = {10,20,30,40,50};
  
  for(int i = 0 ; i < arr.length ; i++){

    System.out.println("Arrays Items : " + arr[i]);

  }
  System.out.println("/=====================================/");
  System.out.println("Array first item : " + arr[0]);
}

}