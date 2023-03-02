import java.util.Scanner;

public class q1 {
    public static void main(String args[]){
        String name[]=new String[3];
        String section[]=new String[3];
        String branch[]=new String[3];
        int Rollno[]=new int[3];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.println("Enter name: ");
       
        name[i]=sc.next();
        System.out.println("Enter rollno: ");
        Rollno[i]=sc.nextInt();
        System.out.println("Enter section: ");
        section[i]=sc.next();
        System.out.println("Enter branch name: ");
        branch[i]=sc.next();
        }
       for(int i=0;i<3;i++){
       System.out.println("DETAILS ARE AS FOLLOWS: ");
       System.out.println("Name: "+name[i]);
       System.out.println("RollNo: "+Rollno[i]);
       System.out.println("Section: "+section[i]);
       System.out.println("Branch: "+branch[i]);
       }

    }
    
}
