import java.util.*;
class box{
     Scanner sc=new Scanner(System.in);
     int length,width,height;
     box(){

          System.out.println("Enter the length: ");
          length=sc.nextInt();
          System.out.println("Enter the width: ");
          width=sc.nextInt();
          System.out.println("Enter the height: ");
          height=sc.nextInt();
          
     }
          void volume(){
               System.out.println("Volume is: "+length*width*height);
          }

     
}
class demo {
     public static void main(String args[]){
          box ob1=new box();
          ob1.volume();
     }
}
