class Address{
    String state,city,area;
     Address(String state,String city,String area){
        this.state = state;
        this.city = city;
        this.area = area;
    }
}

class Aggregation{
    int ID;
    String employee_name;
    Address add;

    Aggregation(int ID, String employee_name, Address add){
        this.ID = ID;
        this.employee_name = employee_name;
        this.add =add;
    }

    void display(){
        System.out.println("Name: "+employee_name);
        System.out.println("ID: "+ID);
        System.out.println("Address: "+add.state+","+add.city+","+add.area);
    }
    public static void main(String[] args){
        Address ad = new Address("Raj","Jaipur","Jagatpura");
        Address ad2 = new Address("Raj", "Jaipur","Mansarovar");

        Aggregation ag =  new Aggregation(1234,"Nakshatra",ad);
        Aggregation ag2 = new Aggregation(4321,"Aman",ad2);

        ag.display();
        ag2.display();
    }
}

