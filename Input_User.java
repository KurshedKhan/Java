import java.util.Scanner;// Import the Scanner Class

public class Input_User {

            /* Input from the users 
            
             * Input Types: ==>>

                                Method	            Description

                            1.nextBoolean()	==>    Reads a boolean value from the user
                            2.nextByte()	==>    Reads a byte value from the user
                            3.nextDouble()	==>    Reads a double value from the user
                            4.nextFloat()	==>    Reads a float value from the user
                            5.nextInt()	    ==>    Reads a int value from the user
                            6.nextLine()	==>    Reads a String value from the user
                            7.nextLong()	==>    Reads a long value from the user
                            8.nextShort()	==>    Reads a short value from the user

             */
    public static void main(String[] args){

            Scanner scan = new Scanner(System.in);// Create a Scanner object
            String UserName;//declaration of variable
            int UserAge;
            float UserMarks;


            System.out.println("Enter User Name :");// Print statement
            UserName = scan.nextLine();// Read user input
            
            System.out.println("Enter user Age :");
            UserAge = scan.nextInt();
            
            System.out.println("Enter User Marks :");
            UserMarks = scan.nextFloat();


            System.out.println(" My name is :" + UserName);// Output user input
            System.out.println(" My Age is :"+ UserAge);
            System.out.println("My Marks is :"+ UserMarks);
        }
        
    

}
