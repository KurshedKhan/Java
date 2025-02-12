class variable {
    
    // ** Variable **
    // A variable is a container which holds the value while the Java program is executed. 
    // A variable is assigned with a data type.
    // A variable is the name of a reserved area allocated in memory.

    

    // ** Instance variable **
    // A variable declared inside the class but outside the body of the method, 
    // is called an instance variable.
    // It is not declared as static.
    
    public String name; // instance variable
    public int age; // // instance variable
    
    public variable (){
        this.name = "Kanchana Ji";
        this.age = 218;
    }


    // ** static variable **
    // A variable that is declared as static(keyword) is called a static variable. 
    // It cannot be local. 
    // You can create a single copy of the static variable and 
    // share it among all the instances of the class. 
    // Memory allocation for static variables happens 
    // only once when the class is loaded in the memory.

    static int age1;

    public static void main(String[] args) {

        // ** local Variable **
        // A variable declared inside the body of the method is called local variable.
        // A variable declared inside the body of the method is called local variable. 
        // You can use this variable only within that method and 
        // the other methods in the class aren't even aware that the variable exists. 
        // A local variable cannot be defined with "static" keyword.


        int number = 101; // local variable (number is a variable)
        
        System.out.println("Hello World");


        // for instance variable accessing
        variable obj = new variable();

        System.out.println("Name is : " + obj.name);
        System.out.println("Age is : " + obj.age);

        variable st = new variable();
        st.age1 = 20;
        variable st1 = new variable();
        st1.age1 = 30;

        variable.age1 = 50;

        System.out.println("Static Variable value age1 1:" + st.age1);
        System.out.println("Static Variable value age1 2:" + st1.age1);
        System.out.println("Static Variable value age1 3:" + age1);
        


    }

    
}
