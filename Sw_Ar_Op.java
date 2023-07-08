import java.util.*;
public class Sw_Ar_Op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        while(true){
            System.out.println("choose +,/,*,-");
            String c=sc.next();
            switch(c){
                case "+":System.out.println("Addition of two number is "+(x+y));
                break;
                case "-":System.out.println("subtraction of two number is "+(x-y));
                break;
                case "*":System.out.println("Multiplication of two number is "+(x*y));
                break;
                case "/":System.out.println("Division of two number is "+(x/y));
                break;
                case "x":System.out.println("Programm end");
                System.exit(0);
                default:System.out.println("Wrong choice");
                break;

            }
        }
    }
}
