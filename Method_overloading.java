class Method_overloading {   // method overloading by changing number of parameters
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
class overloading2{  // method overloading by changing data types
    static int add (int a, int b){
        return a+b;
    }
    static float add(float a, float b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println("Class 1 results:");
        System.out.println("Addition of 24 and 26");
        System.out.println(Method_overloading.add(24,26));
        System.out.println("Addition of 23 36 28");
        System.out.println(Method_overloading.add(23,36,28));
        System.out.println("Class 2 results:");
        System.out.println("sum of 28 and 26");
        System.out.println(overloading2.add(28,26));
        System.out.println("sum of 28.6 and 26.3");
        System.out.println(overloading2.add(28.6f,26.3f));
    }
}