interface shape{
    void draw();
}

class square implements shape{
   public void draw(){
        System.out.println("drawing square");
    }
}

class circle implements shape{
    public void draw(){
        System.out.println("drawing circle");
    }
}
public class DRAWSHAPE {
    public static void main(String[] args){
        shape sha = new circle();

        shape sha1 = new square();
        sha.draw();
        sha1.draw();
        System.out.println(sha instanceof square);
    }
}
