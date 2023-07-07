import java.util.*;
interface Rect{
    void area();
    void perimeter();
}
class Calculate implements Rect{
    Scanner sc=new Scanner(System.in);
    int l,w;
    void take(){
        System.out.println("Enter length and width of rectangle");
        l=sc.nextInt();
        w=sc.nextInt();
    }
    public void area(){
        System.out.println("Area of rectangle = "+(l*w));
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle = "+(2*(l+w)));
    }
}
public class ar_per_int {
    public static void main(String[] args) {
        Calculate cal=new Calculate();
        cal.take();
        cal.area();
        cal.perimeter();
    }
}
