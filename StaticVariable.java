
class StaticVariable {

    int id;
    int salary;
    String name;
    static String company = "Tech Innovation";

    StaticVariable(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    void display() {
        System.out.println("========================");
        System.out.println(" Name : " + name);
        System.out.println(" Salary : " + salary);
        System.out.println(" Id : " + id);
        System.out.println(" Company : " + company);
        System.out.println("========================");
    }

    public static void main(String[] args) {

        StaticVariable obj = new StaticVariable(101, 25000, "Ankita");
        StaticVariable obj6 = new StaticVariable(102, 220000, "Sapna");
        StaticVariable obj2 = new StaticVariable(103, 23000, "Riya");
        StaticVariable obj3 = new StaticVariable(104, 21000, "Mohini");
        StaticVariable obj4 = new StaticVariable(105, 20000, "Pinky");
        StaticVariable obj5 = new StaticVariable(106, 2000, "Priya");
        obj.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
        obj6.display();
    }
}
