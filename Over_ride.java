class Teacher_{
    void taught_oop(){
        System.out.println("Techer taught object oriented programming in section A");
    }
}
class Student extends Teacher_{
    @Override
    void taught_oop(){
        System.out.println("Student learn opps from Ritesh");
    }
}
public class Over_ride {
    public static void main(String[] args) {
        Student ob9=new Student();
        ob9.taught_oop();
    }
}
