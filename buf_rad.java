import java.io.*;
import java.util.*;
public class buf_rad {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String n=reader.readLine();
        System.out.println("Hello! "+n);
    }
}
