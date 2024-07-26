
class Animal {

    void eat() {
        System.out.println("This is animal");
    }
}

class Dog extends Animal {

    void speak() {
        System.out.println("This is dog barking");
    }
}

public class TestInheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.speak();
    }
}
