class bank{        // here we are using hierarchial inheritance and method overriding to display
    int getRate_of_interest(){return 0;}   //various rate of interest of different banks
}
class AXIS extends bank{
    int getRate_of_interest(){return 8;}
}
class ICICI extends bank{
    int getRate_of_interest(){return 7;}
}

public class inherit_overriding {
    public static void main(String[] args){
        AXIS ax = new AXIS();
        ICICI ic = new ICICI();
        System.out.println("Rate of interest of axis bank is = "+ax.getRate_of_interest());
        System.out.println("Rate of interest of icici bank is = "+ic.getRate_of_interest()  );
    }
}
