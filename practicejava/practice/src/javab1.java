import java.util.*;

import javax.lang.model.util.ElementScanner14;
class javab1{
     
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a=sc.nextInt();
    if(a/10==0)
    {
        if(a%2==0){
            System.out.println("The number is of single digit and is even ");
        }
        else
        {
            System.out.println("The number is of single digit and is odd ");
        }
    }
    else{
        if(a%5==0){
            System.out.println("The number is not of single digit and is divisible by 5");
        }
        else
        {
            System.out.println("The number is not of single digit and is not divisible by 5");
        }
    }
}
}