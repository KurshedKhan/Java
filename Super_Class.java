class Animal2{
    String color= "White";
}
class dog2 extends Animal2{
    String color = "Black";

    void displaycolo(){
        System.out.println("Color of bear: "+ color);
        System.out.println("Color of dog: "+super.color);
    }
}
public class Super_Class {
    public static void main(String[] args){
        dog2 dg = new dog2();
        dg.displaycolo();
    }
}
