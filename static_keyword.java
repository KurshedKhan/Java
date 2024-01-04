class Statstud{
    String name;
    int roll;
    static String college = "ITS";

    Statstud(String n, int r){
        name = n;
        roll = r;
    }

    void display(){
        System.out.println(college);
        System.out.println("name: "+ name+ "\nRoll No: "+ roll);
    }
}
public class static_keyword {
    public static void main(String[] args){
        Statstud st = new Statstud("NAKSH", 214);
        st.display();
        Statstud st1 = new Statstud("AMAN", 116);
        st1.display();
    }
}
