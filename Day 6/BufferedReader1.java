import java.io.*;;


public class BufferedReader1 {
  
  // The BufferedReader class belongs to java.io package. 
  // It can be used to read text from an input stream efficiently. 
  // It is particularly useful when we need to read large amounts of text.

  public static void main(String[] args) {
    
    System.out.println("Buffered Reader Classes for large Text :");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   try {
    
    String name ;
    int age;
    double height;


    System.out.print("Enter your name : ");
    name = reader.readLine();

    System.out.print("Enter your age : ");
    age = Integer.parseInt(reader.readLine());

    System.out.print("Enter your height : ");
    height = Double.parseDouble(reader.readLine());

    System.out.println("=================================");
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Height : " + height);
    System.out.println("=================================");

   } catch (IOException e) {
    e.printStackTrace();
   }
  }
}
