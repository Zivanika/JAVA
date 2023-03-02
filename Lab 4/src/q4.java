import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
        int x=0;
        int rnum=0;
        int remainder=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        x=num;
        while(num!=0){
          remainder=num%10;
          rnum=rnum*10+remainder;
          num/=10;
        }
        if(x==rnum){ 
            System.out.println("Palindrome successfully detected");
        }
        else
        {
            System.out.println("The input number is not a palindrome");
        }
    }
}
