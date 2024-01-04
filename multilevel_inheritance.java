class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Animal is a dog so he barks");
    }
}
class BabyDog extends Dog{
    void weeps(){
        System.out.println("Dog is a puppy and is weeping");
    }
}
public class multilevel_inheritance{
    public static void main(String[] args){
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weeps();
    }
}