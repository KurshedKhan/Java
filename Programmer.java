
class Employee {

    float salary = 15000;

}

public class Programmer extends Employee {

    int bonus = 2000;

    public static void main(String[] args) {

        Programmer p = new Programmer();

        System.out.println("Parent class data : " + p.salary);
        System.out.println("Child Class Data : " + p.bonus);
    }
}
