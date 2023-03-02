import java.util.Scanner;
public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your chemistry marks(out of 100): ");
        int marks=sc.nextInt();
        String grade;
        if(marks>=90){
           grade="A-Excellent";
        }
        else if(marks>=80 && marks<90){
            grade="B-Very Good";
        }
        else if(marks>=70 && marks<80){
            grade="C-Good";
        }
        else if(marks>=60 && marks<70){
            grade="D-Satisfactory";
        }
        else if(marks<60 && marks>=50){
            grade="E-Work Hard";
        }
        else if(marks<50 &&  marks>=40){
            grade="F-Just Passed";
        }
        else{
            grade="Failed";
        }
        System.out.println(grade);
    }
    
}
