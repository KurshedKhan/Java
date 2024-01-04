abstract class honda{
    honda(){
        System.out.println("This Honda has 999cc engine");
    }
    abstract void model();
    void tspeed(){
        System.out.println("It has top speed of 399km/h");
    }
}
class cbr1000rr extends honda{
    void model(){
        System.out.println("Its FIREBLADE");
    }
}

public class abstraction {
    public static void main(String[] args){
        honda ho = new cbr1000rr();
        ho.model();
        ho.tspeed();
    }
}
