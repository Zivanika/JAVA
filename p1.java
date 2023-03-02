class p1 {

  static int count = 0;

  p1() {
    count++;
    System.out.println("count: " + count);
  }

  public static void main(String args[]) {
    p1 ob1 = new p1();
  }
}
