class Details {
    String name;
    int age;
    String dob;
}
class Student{
    int roll;
    String section;

    public static void main(String[] args){
        Details s1 = new Details();
        s1.name = "Naksh";
        s1.age = 21;
        s1.dob = "04/12/2002";
        Student s2 = new Student();
        s2.roll = 24;
        s2.section = "12-F";

        System.out.println("Name = "+s1.name);
        System.out.println("Roll number = "+s2.roll);
    }
}

