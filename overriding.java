class transport{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class overriding extends transport{
    void run(){
        System.out.println("Vehicle is bike and its running safely at a speed of 200kmph");
    }
    public static void main(String[] args){
        transport tbj = new transport();
        tbj.run();
        overriding obj = new overriding();
        obj.run();
    }
}
