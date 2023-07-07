class Employee{
    String name,adress;
    Employee(String n,String add){
        name=n;
        adress=add;
    }
}
class Teacher extends Employee{
    String dpt,c_name;
    Teacher(String name,String address,String dept,String cour){
        super(name, address);
        dpt=dept;
        c_name=cour;
    }
    void display(){
        System.out.println("Teacher name "+name+" department from "+dpt+" taught "+c_name+" and adress is "+adress);
    }
}
class Office_Staff extends Employee{
    int staff_no;
    Office_Staff(String name,String add,int no){
        super(name, add);
        staff_no=no;
    }
    void print(){
        System.out.println("Staff name is "+name+" Staff no is "+staff_no+" and adress is "+adress);
    }
}
public class mul_inher{
    public static void main(String[] args) {
        Teacher obj=new Teacher("R.p.", "Saltlake 70001", "CSE", "OOps");
        obj.display();
        Office_Staff obj1=new Office_Staff("RAban", "Barasat.chapadali,North_24-pargana", 8937);
        obj1.print();
    }
}
