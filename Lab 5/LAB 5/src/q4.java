import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter "+l+" elements into the array: ");
        for(int i=0;i<l;i++){
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++){
            int count=1;
            if(arr[i]!=0){
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]==arr[j]){
                count++;
                arr[j]=0;
                }

            }
            System.out.println(arr[i]+" "+count);
        }
    }

}
}
