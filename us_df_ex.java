class Myexception extends Exception{
    Myexception(String s){
        super(s);
        System.out.println("Exception created");
    }
}
public class us_df_ex {
    public static void main(String[] args) {
        int x=-12;
        try{
            if(x>=0){
                System.out.println("Okay");
            }
            else{
                throw new Myexception(" let see");
            }
        }
        catch(Myexception e){
            System.out.println("Exception handeled");
            // System.out.println(e.getMessage());
        }
    }
}