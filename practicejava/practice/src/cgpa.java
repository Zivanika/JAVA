import java.util.Scanner;
public class cgpa {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the students: ");
        int n=sc.nextInt();
        int roll[]=new int[n];
        String name[]=new String[n];
        double cgpa[]=new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details for student "+i+1);
            System.out.println("Enter rollno: ");
            roll[i]=sc.nextInt();
            System.out.println("Enter name: ");
            name[i]=sc.next();
            System.out.println("Enter cgpa: ");
            cgpa[i]=sc.nextDouble();

        }
        double min=cgpa[0];
        int a=0;
        for(int i=0;i<n;i++){
            if(min>cgpa[i]){
                min=cgpa[i];
                a=i;
            }
        }
        System.out.println(name[a]+" has scored the lowest cgpa ");
        System.out.println("Roll No.: "+roll[a]);
        System.out.println("CGPA: "+cgpa[a]);
    }
}
