class Counter{
    int num = 0;

    Counter(){
        num++;
        System.out.println(num);

    }
}
class Counter2{
   static int num2 = 0;

    Counter2(){
        num2++;
        System.out.println(num2);
    }
}
public class Statickeyword {

    public static void main(String[] args){
        Counter s = new Counter();
        Counter s2 = new Counter();
        Counter s3 = new Counter();
        System.out.println("after using static keyword");
        Counter2 t = new Counter2();
        Counter2 t2 = new Counter2();
        Counter2 t3 = new Counter2();
    }
}
