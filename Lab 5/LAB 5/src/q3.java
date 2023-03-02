import java.util.*;
class q3{
 
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        System.out.println("Enter the contents of the array: ");
        for(int i=1;i<args.length;i++){
            System.out.println(args[i]);
            Integer.parseInt(args[i]);
        }
        System.out.println("SORTED ARRAY");
        
    
        int n = args.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (args[j] >args[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = Integer.parseInt(args[j]);
                    Integer.parseInt(args[j]) = Integer.parseInt(args[j + 1]);
                    Integer.parseInt(args[j + 1]) = temp;
                
    }
    }
}