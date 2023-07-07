import java.util.Scanner;

class overloading_2{
    void area(int a){
        int area=a*a;
        System.out.println("Area of square = "+area);
    }
    void area(float r){
        double area=3.14*r*r;
        System.out.println("Area of circle = "+area);
    }
}
public class air_cir_sq_methodoverloading {
    public static void main(String[] args) {
        overloading_2 obj=new overloading_2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of square");
        int l=sc.nextInt();
        System.out.println("Enter radius of circle");
        float r=sc.nextFloat();
        obj.area(r);
        obj.area(l);
    }
}
