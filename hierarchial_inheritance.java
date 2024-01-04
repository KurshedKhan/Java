class Creatures {
    void breathing(){
        System.out.println("Animal is breathing");
    }
}
class Bird extends Creatures{
    void fly(){
        System.out.println("Animal is a bird so it fly and breaths through nostrils");
    }
}
class Fish extends Creatures{
    void swim(){
        System.out.println("animal is fish so it swims and breath through gills");
    }
}
public class hierarchial_inheritance{
    public static void main(String[] args){
        Bird b = new Bird();
        b.breathing();
        b.fly();

        Fish f = new Fish();
        f.breathing();
        f.swim();
    }
}