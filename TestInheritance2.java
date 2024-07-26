
class Animal {

    void eat() {
        System.out.println("eating animal");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking bog");
    }

}

class BabyDog extends Dog {

    void babydog() {
        System.out.println("This is baby dog.");
    }
}

class elephant extends BabyDog {

    void Elephant() {
        System.out.println("This is elephant.");
    }
}

public class TestInheritance2 {

    public static void main(String[] args) {

        elephant BD = new elephant();
        BD.eat();
        BD.Elephant();
        BD.bark();
    }
}
