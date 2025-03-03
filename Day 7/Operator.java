public class Operator {

  // ** Operator **
  // Operator are an essential part of any programming language. In Java,
  // operator is a symbol that is used to perform operations. 
  // For example: +, -, *, / etc. 
  // These are essential for performing different types of operations 
  // on variables and values.

  // 1. Java Unary Operator
  // The Java unary operators require only one operand. 
  // Unary operators are used to perform various operations i.e.:

  //  incrementing/decrementing a value by one
  //  negating an expression
  //  inverting the value of a boolean

  public static void main(String[] args) {
    
   int x = 10;
   x++;
   System.out.println(" x is : " + x++);
   System.out.println("X is now : " + x);

   int y = 20;
   y--;// post decrement
   --y; // pre decrement
   System.out.println("y is : " + --y);
   System.out.println("Y is now " + y);

   int a = 10;
   System.out.println(a++ + ++a); // arbaj ==> 10 + 12 ==> 22
   System.out.println(++a + a++); // sachin ==> 13 + 13 ==> 26
    System.out.println("a : " + a);

   }
}
