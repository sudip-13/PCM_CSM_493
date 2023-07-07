import java.util.*;
class Floor{
    int len,wid;
    Floor(int l,int w){
        len=l;
        wid=w;
    }
    int area(){
        return len*wid;
    }
}
class Room extends Floor{
    int hei;
    Room(int l,int w,int h){
        super(l,w);
        hei=h;
    }
    int volume(){
        return len*wid*hei;
    }
}
public class sing_inher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,w,h;
        System.out.println("Enter length , width and height");
        l=sc.nextInt();
        w=sc.nextInt();
        h=sc.nextInt();
        Room v=new Room(l,w,h);
        System.out.println("Area of the room is = "+v.area());
        System.out.println("Volume of the room is = "+v.volume());
    }
}
