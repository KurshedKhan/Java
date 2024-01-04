import java.util.Scanner;
public class while_loop {
    public static void main(String[] args){
        int a;
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter number to print: ");
        a = scanIn.nextInt();

        int i = 0;

        while( i <= a){
            System.out.println(i);
            i++;
        }
    }
}
