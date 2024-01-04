public class variables {

    static int c = 100; //STATIC VARIABLE

    void method(){
        int d = 10; // LOCAL VARIABLE
    }
    public static  void main(String[] args){
        int a = 10;// INSTANCE VARIABLE
        float b = (float) a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Widening");

        float e = 10.5f;
        int f = (int)e;
        System.out.println("\n" + e);
        System.out.println(f);
        System.out.println("Narrowing");

        int g = 150;
        byte h = (byte)g;
        System.out.println("\n" + g);
        System.out.println(h);
        System.out.println("Overflowing");

        byte i = 20;
        byte j = 30;
        byte k = (byte)(i + j);
        System.out.println("\n" + i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("Adding lower type");

    }
}
