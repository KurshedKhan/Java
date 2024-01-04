interface Printable{
    void Draw();
}
interface Showable{
    void Display();
}
class Art implements Printable,Showable{
    public void Draw(){
        System.out.println("Hello!");
    }
    public void Display(){
        System.out.println("You are welcome in art class");
    }
}

public class SHAPES {
    public static void main(String[] args){
        Art a6 = new Art();
        a6.Draw();
        a6.Display();
    }
}
