import java.util.*;
public class area {
     void area(int r){
        System.out.println("Area of the circle is : "+ 3.14*r*r);
     }
     void area(double s){
        System.out.println("Area of the square is: "+ s*s);
     }
     void area(int a,int b){
        System.out.println("Area of the rectangle is: "+ a*b);
     }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("---THE CHOICES ARE---");
        System.out.println("1.Area of the circle");
        System.out.println("2.Area of the sqaure");
        System.out.println("3.Area of the rectangle");
        System.out.println("--------------------------");
        System.out.println("Enter your choice: ");
        int ch=sc.nextInt();
        area obj=new area();
        switch(ch){
            case 1:
               System.out.println("---CIRCLE---");
               System.out.println("Enter the radius of the circle: ");
               int radius=sc.nextInt();
               obj.area(radius);
               break;
            case 2:
               System.out.println("---SQUARE---");
               System.out.println("Enter the side of the square: ");
               double side=sc.nextInt();
               obj.area(side);
               break;
            case 3:
               System.out.println("---RECTANGLE---");
               System.out.println("Enter the length and breadth of the rectangle: ");
               int x=sc.nextInt();
               int y=sc.nextInt();
               obj.area(x,y);
               break;
            default:
               System.out.println("Invalid Input!!");
        }

     }
     }


