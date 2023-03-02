import java.util.Scanner;
class shape{
    int length,breadth,radius;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length,breadth and radius: ");
        length=sc.nextInt();
        breadth=sc.nextInt();
        radius=sc.nextInt();
    }
}
class rectangle extends shape{
    void recarea(){
 System.out.println("The area of the rectangle is: "+length*breadth);
}
}

public class circle extends shape{
void cirarea(){
    System.out.println("The area of the circle is: "+3.14*radius*radius);
}
   public static void main(String args[]){
    circle cir1=new circle();
    cir1.cirarea();
    rectangle rec1=new rectangle();
    rec1.recarea();
   } 
}
