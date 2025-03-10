import java.util.Scanner;

public class primeNumber {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your number for check Prime Number : ");
    int num = scan.nextInt();

    if(num < 2 ){
      System.out.println("This number is not prime number.");
    }
    else{
      boolean isPrime = true;
      for(int i = 0 ; i < num ; i++){
        if(num % i == 0){
          isPrime = false;
          break;
        }
      }

      if(isPrime){
        System.out.println("This is prime number.");
      }
      else{
        System.out.println("This is not Prime number.");
      }
    }
  }
}
