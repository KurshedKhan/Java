import java.util.Scanner;
public class user_input {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a ;
        float flo ;
        String str;
        System.out.println("Enter your number :");
        a = scan.nextInt();
        flo = scan.nextFloat();
        str = scan.next();
        System.out.println(a);
        System.out.println(flo);
        System.out.println(str);
    }
}
