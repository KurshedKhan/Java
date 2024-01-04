import java.util.Scanner;

public class operators {
    public static void main(String[] args){

        //UNIARY OPEARTOR
        int a = 4;
        int b = 8;
        System.out.println("Value = "+a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        //ARITHMETIC OPERATORS
        System.out.println("\nMultiplication = 4*8 = "+ (a * b) );
        System.out.println("Division = 8/4 = "+ (b / a) );
        System.out.println("Remainder = 8%4 = "+ (b % a) );
        System.out.println("Addition = 4+8 = "+ (a + b) );
        System.out.println("Subtraction = 8-4 = "+ (b - a) );
        //SHIFT
        int c = 20;
        System.out.println("\nRight Shift << "+(a<<b));
        System.out.println("Left Shift >> "+(c>>a));
        System.out.println("Shift >>>"+(c>>>a));
        //RELATIONAL OPERATORS
        Scanner ifelseinput = new Scanner(System.in);   //<,>,<=,>=,==,=!
        int d , e;
        System.out.println("\nEnter Value For A = ");
        d = ifelseinput.nextInt();
        System.out.println("Enter value for B = ");
        e = ifelseinput.nextInt();
        if( d < e ){
            System.out.println("B is Greater"+e);
        }
        else{
            System.out.println("A is Greater"+d);
        }
        if( d >= e ){
            System.out.println("Relational [small]"+d);
        }
        else{
            System.out.println("RELATIONAL [caps]"+e);
        }
        //LOGICAL OPERATORS
        int num1;
        System.out.println("\nEnter value to check odd or even: ");
        num1 = ifelseinput.nextInt();
        if((num1 % 4) == 0){
            System.out.println("Number "+num1+" is even and divisible by 4");
        }
        else if((num1%2==0) && (num1%4) != 0){
            System.out.println("Number "+num1+" is even but not divisible by 4");
        }
        else{
            System.out.println("It is an odd number");
        }
        }

    }

