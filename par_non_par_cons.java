import java.util.*;
class cons{
    cons(){
        System.out.println("You are in parameterized constructor");
    }
    cons(int a){
        System.out.println("You are in parameterized constructor");
        System.out.println("Square of the number is "+(a*a));
    }
}
public class par_non_par_cons {
    public static void main(String[] args) {
        cons c=new cons();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        cons c1=new cons(num);
    }
}
