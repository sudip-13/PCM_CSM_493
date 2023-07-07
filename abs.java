abstract class Abst{
    Abst(){
        System.out.println("You are in base class constructor");
    }
    abstract void display();
    void show(){
        System.out.println("Non-abs method called");
    }
}
class Der extends Abst{
    void display(){
        System.out.println("Abs method implemented");
    }
}
public class abs {
    public static void main(String[] args) {
        Der d=new Der();
        d.show();
        d.display();
    }
}
