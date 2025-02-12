public class TypeCasting {
  
  
  public static void main(String[] args) {
    
    System.out.println("Hello World");
    // local variable in method
    int num = 10;
    System.out.println("Number : "+ num); // integer

    // widening in java
    float dec = num; // widening 

    System.out.println("Decimal : " + dec); // floating

    // ==============================================
    // TypeCasting in java
    float decimal1 = 10.5f;

    System.out.println("Decimal1 : " + decimal1);

    int age = (int)decimal1;

    System.out.println("Age : " + age);


    // Overflow in java

    int value = 138;
    byte a = (byte)value;
    System.out.println("Overflow : " +  a);

    // Adding Lower Type

    byte c = 10;
    byte d = 10;
    byte e = (byte)(c + d);
    System.out.println("E : " + e);


    // final keyword
    // The final keyword is used to declare a constant variable in Java, 
    // meaning its value cannot be changed once initialized.
    final int number1 = 10;
    System.out.println(" Final Variable : " + number1);

    // number1 = 30; // cannot be changed once initialized
    
    // In Java, an uninitialized int variable has a default value of 0.
    int num1;
    System.out.println(" Name : " + num1);

    // Note : To declare a variable that can hold a fractional value, 
    //        you use the float or double data types in Java.
  }

}
