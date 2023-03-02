import java.util.Scanner;
class this1{
    void m(){
        System.out.println("This function is callled by this pointer :D");
    }
    void n(){
        this.m();
    }
    public static void main(String args[]){
        this1 obj=new this1();
        obj.n();
    }
}