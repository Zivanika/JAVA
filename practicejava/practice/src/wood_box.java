import java.util.Scanner;

class plate {
    plate(){
        System.out.println("Plate constructor in invoked (O)");
    }
}
class box extends plate{
    box(){
        System.out.println("Box constructor is invoked [ ]");
    }
}
public class wood_box extends box{
    wood_box(){
        System.out.println("Wood_Box constructor is invoked [-]");
    }
    public static void main(String args[]){
        wood_box obj1=new wood_box();
    }
}