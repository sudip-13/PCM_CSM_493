import java.util.*;
class Number{
    void num(){
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%2==0){
                flag=1;
                break;
            }
        }
        if(n==1){
            System.out.println("Number is not prime number");
        }
        else if(flag==1){
            System.out.println("Number is not prime number");
        }
        else{
            System.out.println("Number is prime number");
        }
        sc.close();
    }
}
public class Prime {
    public static void main(String[] args) {
        Number obj=new Number();
        obj.num();
    }
}
