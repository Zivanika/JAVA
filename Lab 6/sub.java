
    import java.util.Scanner;
class sub{
    Scanner sc=new Scanner(System.in);
    void subtract(int a ,int b){
        int c=a-b;
        System.out.println("Subtraction in case of integers: "+c);
    }
    void subtract(double a,double b){
        double c=a-b;
        System.out.println("Subtraction in case of double: "+c);
    }
    public static void main(String args[]){
        sub ob1=new sub();
        System.out.println("Enter values of a and b: ");
        ob1.subtract(10.0,9.0);
    }
}

