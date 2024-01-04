import java.util.Scanner;
class Banking{
    String name = null;
    String acc = null;
    int balance = 10000;
    Scanner userIN = new Scanner(System.in);

    public Banking(String name, String acc, int balance) {
        this.name = name;
        this.acc = acc;
        this.balance = balance;
    }

    void display(){
        System.out.println("Enter your name:");
        name = userIN.next();
        System.out.println("Enter your account number:");
        acc = userIN.next();

    }

    public static void main(String[] args){
        Banking bt = new Banking(null,null,10000);
        bt.display();
        Scanner userIN = new Scanner(System.in);
        int a;
        int amount;

        System.out.println("Hello!"+bt.name+"\nPlease select the process to proceed with:");
        System.out.println("1.Withdraw   2.Deposit  3.Exit");
        a = userIN.nextInt();

        if(a == 1){
            System.out.println("Enter amount to withdraw: ");
            amount = userIN.nextInt();
            if(amount <= bt.balance){
                bt.balance = bt.balance - amount;
                System.out.println(amount+" Amount withdrawal "+ bt.balance+" remaining balance");
            }
            else{
                System.out.println("insufficient balance");
            }
        }
        else if(a == 2){
            System.out.println("Enter amount to deposit: ");
            amount = userIN.nextInt();
            bt.balance = bt.balance + amount;
            System.out.println(amount+" Amount deposited "+bt.balance+" Is updated balance");
        } else if (a == 3){
            System.out.println("transaction cancelled");
        }
        else{
            System.out.println("invalid input");
        }

    }
}
