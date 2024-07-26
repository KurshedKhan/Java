
abstract class Demo {
    
    abstract void creadMethod();
   
}

public class Implement extends Demo{

     void creadMethod(){
        System.out.println("you are created a app.");
    }

    public static void main(String[] args) {
        
         Demo obj = new Demo();
         obj.creadMethod();
         
    }
    
}
