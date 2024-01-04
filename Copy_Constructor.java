public class Copy_Constructor {
    String name;
    int age;

    Copy_Constructor(String Name, int Age){
        name = Name;
        age = Age;
    }

    Copy_Constructor(Copy_Constructor s){
        name = s.name;
        age = s.age;
    }
    void infoOut(){
        System.out.println("Name = " + name+ "\nAge= " + age);
    }
    public static void main(String[] args){
        Copy_Constructor s1 = new Copy_Constructor("naksh", 21);
        Copy_Constructor s2 = new Copy_Constructor(s1);
        s1.infoOut();
        s2.infoOut();
    }
}
 