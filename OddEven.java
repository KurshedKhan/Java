import java.util.Scanner;

public class OddEven {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number of odd/even numbers :");
        int num = obj.nextInt();

        OddEven1(num);

    }

    public static void OddEven1(int num){

        if(num%2 == 0){
            System.out.println("This number is even : " + num);
        }
        else{
            System.out.println("This number is odd : " + num);
        }
        
    }
}
