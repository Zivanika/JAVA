import java.util.Scanner;

public class q2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char arr[] = new char[10];

    System.out.println("Enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
      arr[i] = sc.next().charAt(0);
    }
    for (int i = 0; i < 10; i++) {
      if (Character.isDigit(arr[i]) == false) {
        System.out.println("Enter valid integers!!!");
        System.exit(0);
      }
    }
    System.out.println("\nNumber\t: Frequency: (Even/Odd)");
    for (int i = 0; i < 10; i++) {
      int count = 1;
      String oe = " ";
      if (arr[i] != 0) {
        for (int j = i + 1; j < 10; j++) {
          if (arr[i] == arr[j]) {
            count++;
            arr[j] = 0;
            if (arr[i] % 2 == 0) {
              oe = "Even";
            } else {
              oe = "Odd";
            }
          }
        }
        System.out.println(arr[i] + "\t" + count + "\t" + oe);
      }
    }
  }
}
