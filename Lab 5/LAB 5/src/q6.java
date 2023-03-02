public class q6 {

  static int count;

  q6() {
    count++;
  }

  public static void main(String args[]) {
    q6 ob1 = new q6();
    q6 ob2 = new q6();
    q6 ob3 = new q6();
    System.out.println("Number of objects created is "+count);
  }
}
