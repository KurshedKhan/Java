
class Animal {

    void eat() {
        System.out.println("eating Food Animal.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Meow");
    }
}

public class TestInheritance3 {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.meow();
    }

}
