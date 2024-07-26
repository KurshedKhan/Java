class Variable {

    static int get = 0; // static variable
    void method(){
        int a = 30; // local variable
        int b = 40; // local variable   
    }
    public static void main(String[] args) {
        
        int c = 10; // instance variable
        int d = 20; // instance variable
        int e = c + d; // add two numbers
        System.out.println(c);
        System.out.println("Instance variable " + c );
        System.out.println("Instance variable " + e );

    }
}