public class Control_rol_Statement {
  
  public static void main(String[] args) {
    
    // int x = 10;
    // int y = 20;
    // int z = 12;


    // if (x > y && x > z ) {
    //     System.out.println("x is greater than y and z");
    // }
    // else if(y > x && y > z){
    //   System.out.println(" y is greater than x and z");
    // }
    // else{
    //   System.out.println("z is greater than y and x");
    // }


    // String city = "Delhi";

      // switch (city) {
      //     case "Meerut":
      //         System.out.println("City is Meerut");
      //         break;
      //     case "Noida":
      //         System.out.println("City is Noida");
      //         break;
      //     case "Agra":
      //         System.out.println("city is Agra");
      //         break;
      //     default:
      //         System.out.println(city);
      //         break;
      // }

  //     switch (city) {
  //       case "Meerut" -> System.out.println("City is Meerut");
  //       case "Noida" -> System.out.println("City is Noida");
  //       case "Agra" -> System.out.println("city is Agra");
  //       default -> System.out.println(city);
  //   }

  
    String address = "Dehli,India";
    
    //System.out.println(address.startsWith("Dehli"));

    if(address.endsWith("India")){

      if (address.contains("Meerut")) {
          System.out.println("city is Meerut");
      }
      else if (address.contains("Noida")) {
        System.out.println("city is Noida");
      }
      else if (address.contains("Agra")) {
        System.out.println("city is Agra");
      }
      else{
        System.out.println("city is dehli");
      }
    }
    else{
      System.out.println("you are not a indian person");
    }

   }


}
