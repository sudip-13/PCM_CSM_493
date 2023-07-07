import java.util.*;
class Bank{
    private String name;
    private int id,balance;
    Bank(String usname,int idno,int bal){
        name=usname;
        id=idno;
        balance=bal;
    }
    void withdraw(int amo){
        System.out.println("Hi "+name+" you'r Available balance is "+balance);
        balance-=amo;
        System.out.println(amo+ " withdrawan from your account number "+id+ " "+"Remaining balance is "+balance);
    }
    void deposit(int amo){
        System.out.println("Hi "+name+" you'r Available balance is "+balance);
        balance+=amo;
        System.out.println(amo+ " deposited in your account number "+id+ " "+"Remaining balance is "+balance);
    }
}
public class Bank_ac {
    public static void main(String[] args) {
        Bank b=new Bank("Sudip",3609637,10236);
        int amo;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1:for deposit\n Enter 2:for withraw\n Enter 3:for exit\n");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:System.out.println("Enter amount which you want to deposit");
                    amo=sc.nextInt();
                    b.deposit(amo);
                    break;
                case 2:System.out.println("Enter amount which you want to withdraw");
                    amo=sc.nextInt();
                    b.withdraw(amo);
                    break;
                case 3:System.out.println("You exit from server");
                System.exit(0);
                default:System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
