import java.util.*;
class overloarding_1{
    void area(int l,int w){
        int area=l*w;
        System.out.println("Area of rectangle = "+area);
    }
    void area(int r){
        int area=r*r;
        System.out.println("Area of circle = "+area);
    }
}
public class ar_cir_rec_methodoverloading {
    public static void main(String [] args){
        overloarding_1 obj=new overloarding_1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width of rectangle");
        int l=sc.nextInt();
        int w=sc.nextInt();
        System.out.println("Enter radius of circle");
        int r=sc.nextInt();
        obj.area(r);
        obj.area(l, w);
    }
}
