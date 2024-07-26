
public class GetterSetter {

    private int roll;
    private String name;
    private int age;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Student Roll : " + roll);
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }

    public static void main(String[] args) {

        GetterSetter GS = new GetterSetter();
        GS.setRoll(101);
        GS.setName("Ankita");
        GS.setAge(19);
        GS.display();
        System.out.println("=========================");
        GS.setAge(20);
        GS.display();

    }

}
