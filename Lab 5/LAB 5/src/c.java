import java.util.Scanner;
public class c {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int l=sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
                   if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   }
            }
        }
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
        }
    }

