import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        char arr[]=new char[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.next().charAt(0);
        }
        int max=(int)arr[0];
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if((Character.isDigit(arr[i]))==false){
                flag=1;
                break;
            }
            else{
               flag=0;
            }

            }
            if(flag==0){
                for(int i=0;i<3;i++){
                    if(max<(int)arr[i]){
                        max=(int)arr[i];
                    }
                }
                System.out.println("The largest number among the inputs is :"+(char)max);
            }
            else
            {
                System.out.println("Enter valid integrs");
            }
        }
        
    }

