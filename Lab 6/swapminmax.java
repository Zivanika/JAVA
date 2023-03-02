import java.util.Scanner;

public class swapminmax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements into the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int max=0;
        int amx=0;
        int min=0;
        int ami=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                amx=i;
            }
        }
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                ami=i;
            }
        }
        int temp=arr[amx];
        arr[amx]=arr[ami];
        arr[ami]=temp;
        System.out.println("The array after swapping the largest and the smallest element is: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
