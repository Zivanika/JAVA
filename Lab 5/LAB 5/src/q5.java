import java.util.Scanner;
public class q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m1[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            m1[i][j]=sc.nextInt();
        }
    }
    System.out.println("The matrix is: ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(m1[i][j]+" ");
        }
        System.out.println("\n");
    }
    System.out.println("The sum of diagonal elements is: ");
    System.out.println(m1[0][0]+m1[1][1]+m1[2][2]);
    System.out.println(m1[0][2]+m1[1][1]+m1[2][0]);
    
}
}