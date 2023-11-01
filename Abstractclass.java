abstract class Mobile {

    private Boolean call;
    private Boolean endcall;

    Mobile(){

    }
    abstract void call();
    abstract void endcall();
    public Mobile(Boolean call, Boolean endcall) {
        this.call = call;
        this.endcall = endcall;
    }
}


class Iphonex extends Mobile{

     void call(){
         System.out.println("Iphone Calling");
     }
     void endcall(){
         System.out.println("Iphone end Call");
     }
}
class SumsungUltra extends Mobile{

    void call(){
        System.out.println("SumsungUltra Calling");
    }
    void endcall(){
        System.out.println("SumsungUltra end Call");
    }
}
