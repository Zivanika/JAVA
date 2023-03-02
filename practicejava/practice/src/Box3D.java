import java.util.Scanner;
class Sheet2D{
int length,breadth;

}
public class Box3D extends Sheet2D{
    
    int height;
    void calculate(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
        System.out.println("The price for creating the sheet: "+length*breadth*40);
        System.out.println("The price for creating the box is: "+length*breadth*height*60);


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length, breadth and height: ");
        int len=sc.nextInt();
        int brdth=sc.nextInt();
        int hght=sc.nextInt();
        Box3D obj1=new Box3D();
        obj1.calculate(len,brdth,hght);

    }
}
