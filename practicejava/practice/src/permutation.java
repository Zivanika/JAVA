import java.util.Scanner;

public class permutation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=str.length();
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<l;k++){
                    if(i!=j && i!=k && j!=k){
                    
                        System.out.print((int)str.charAt(i)+(int)str.charAt(j)+(int)str.charAt(k));
                        System.out.println("\n");

                
                    }
                }
            }
        }
        
    }
}
