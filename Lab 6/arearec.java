import java.util.*;

public class arearec {
    int l,b;
    void calculate(int x,int y){
        l=x;
        b=y;
        int p=2*(l+b);
        int area=l*b;
        display(p,area);
    }
    void display(int a,int i){
        System.out.println("Area of  the rectangle is: "+i);
        System.out.println("Perimeter of the rectangle is: "+a);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and the breadth of the rectangle: ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        arearec obj=new arearec();
        obj.calculate(p,q);
    }
    
}
