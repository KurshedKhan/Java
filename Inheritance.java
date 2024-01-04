class Employee { // here Employee is parent / super / base class
    float salary = 10000;

    Employee get(){
        return this;
    }
}
class empdetalis extends Employee{
    empdetalis get(){
        return this;
    }
    void message(){
        System.out.println("employee works for ONE");
    }
}
class Inheritance extends Employee{ // inheritance is child / sub / derived class
    int bonus = 5000;
    Inheritance get(){
        return this;
    }
    void message(){
        System.out.println("Employee works for MFN");
    }

    public static void main(String[] args){
        Inheritance in = new Inheritance();
        System.out.println("Salary of employee is : "+in.salary);
        System.out.println("Bonus amount : "+in.bonus);
        new empdetalis().message();
        new Inheritance().message();

    }
}
