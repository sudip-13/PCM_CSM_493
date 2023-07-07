import java.util.*;
class Exe2{
    Scanner sc= new Scanner(System.in);
    void handle2(){
        System.out.println("Enter element in array");
        int [] ar=new int[5];
        try{
            for(int i=0;i<5;i++){
                ar[i]=sc.nextInt();
            }
            System.out.println("Result is ");
            for(int i=0;i<5;i++){
                System.out.print(ar[i]+"\t");
            }
            System.out.println();
        }
        catch(ArithmeticException e1){
            System.out.println("Airthematic exception occured\n"+e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Arrayidexoutof bound exception occured\n"+e2);
        }
        finally{
            System.out.println("code is executed sucessfully");
        }
    }
}
public class try_catch_finally {
    public static void main(String[] args) {
        Exe2 ob=new Exe2();
        ob.handle2();
    }
}