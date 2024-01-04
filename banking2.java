import java.util.Objects;
import java.util.Scanner;

class banking2 {

    String name;
    int pin;
    int balance;
    Scanner scan = new Scanner(System.in);
    banking2(String name, int pin, int balance){
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
    int a;
    void get_details(){
        System.out.println("Enter your userID: ");
        name = scan.next();//userID is N0412
        if(Objects.equals(name, "N0412")){
            System.out.println("Enter your pin: ");
            pin = scan.nextInt();//pin is 8520
            if( pin == 8520 ){
                System.out.println("Login credentials are correct");
                a = 1;
            }
            else{
                System.out.println("incorrect pin");
                a = 2;
            }
        }
        else{
            System.out.println("incorrect userID");
            a = 2;
        }
    }

    public static void main(String[] args){
        banking2 bank = new banking2(null,0,0);
        bank.get_details();

        int b = 0;
        int amount;
        System.out.println("Welcome!");
        if (bank.a == 1){
            while( b!= 3){
                System.out.println("select an option to proceed with: ");
                System.out.println("1.Withdraw  2.Deposit  3.Exit");
                b = bank.scan.nextInt();
                if( b == 1){
                    System.out.println("Enter amount to withdraw: ");
                    amount = bank.scan.nextInt();
                    if ( amount < bank.balance){
                        bank.balance = bank.balance - amount;
                        System.out.println(amount + " deducted\n"+ bank.balance +" = remaining balance");
                    }
                    else{
                        System.out.println("low balance: " + bank.balance);
                    }
                }
                else if(b == 2){
                    System.out.println("Enter amount to deposit: ");
                    amount = bank.scan.nextInt();
                    System.out.println("previous balance was: "+ bank.balance);
                    bank.balance = bank.balance + amount;
                    System.out.println(amount + " deposited\n"+ bank.balance +" = new balance");
                }
                else if(b<1 || b >3){
                    System.out.println("Invalid input");
                    return;
                }
            }
        }
        System.out.println("Successfully logged out!");
    }
}