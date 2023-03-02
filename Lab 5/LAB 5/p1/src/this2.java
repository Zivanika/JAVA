import java.util.Scanner;
public class this2 {
    int Rollno;
    String Name,Course;
    float fee;
    public this2(int Rollno,String Name,String Course){
    this.Rollno=Rollno;
    this.Name=Name;
    this.Course=Course;
    }
    public this2(int Rollno,String Name,String Course,int fee){
        this(Rollno,Name,Course);
        this.fee=fee;
    }
    void display(){
       System.out.println(Name+" "+Rollno+" "+Course+" "+fee);
    }
    public static void main(String args[]){
        this2 s1=new this2(21052665,"Harshita","CSE",175000);
        this2 s2=new this2(21052646,"Akshat","CSE");
        s1.display();
        s2.display();
        
    }
}
