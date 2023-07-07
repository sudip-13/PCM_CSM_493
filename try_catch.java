import java.util.*;
class Exe{
    Scanner sc = new Scanner(System.in);
    
    
    void handle(){
        System.out.println("Enter a integer");
        int a=sc.nextInt();
    try{
        double div=a/0;
        System.out.println(div);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
public class try_catch {
    public static void main(String[] args) {
        Exe obj=new Exe();
        obj.handle();
    }
}

