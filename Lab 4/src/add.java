import java.io.*;
public class add {
    public static void main(String args[])throws IOException
    {
        int a,b,sum;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter another number: ");
        b=Integer.parseInt(br.readLine());
        sum=a+b;
        System.out.println("Sum is : "+sum);  
    }}
