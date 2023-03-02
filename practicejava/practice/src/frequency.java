import java.util.Scanner;
class frequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            int count=1;
            if(arr[i]!=0){
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=0;

                }
                
                }
                System.out.println(arr[i]+" :"+count);
            }
            
        } 
    }
}

// for (int i = 0; i < 10; i++) {
//     int count = 1;
//     String oe = " ";
//     if (arr[i] != 0) {
//       for (int j = i + 1; j < 10; j++) {
//         if (arr[i] == arr[j]) {
//           count++;
//           arr[j] = 0;
//           if (arr[i] % 2 == 0) {
//             oe = "Even";
//           } else {
//             oe = "Odd";
//           }
//         }
//       }
//       System.out.println(arr[i] + "\t" + count + "\t" + oe);
//     }
//   }