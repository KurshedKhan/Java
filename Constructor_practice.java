class Constructor_practice {
    // default constructor gives default values to object
    int id;
    String name;
    String city;
    String state;

/*    default constructor --> no need to make it java make its own
   Constructor_practice(){
        System.out.println("Default constructor created");
    }

 */

    // parameterized constructor
    Constructor_practice(String City){
        System.out.println("Parameterized constructor created");
        city = City;
    }
    Constructor_practice(String City, String State){
        city = City;
        state = State;
    }

    void display(){
        System.out.println("City = "+ city + " State = " + state);
    }


    public static void main(String[] args){
        Constructor_practice s1 = new Constructor_practice("Jaipur");
        Constructor_practice s2 = new Constructor_practice("Jaipur","Rajasthan");
        System.out.println("Default constructor created "+s1.id +" =default value for integer \n"+s1.name+" =default value for string");
        s1.display();
        s2.display();
    }
}
