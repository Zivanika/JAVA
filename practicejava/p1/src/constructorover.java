public class constructorover {
    int rollno;
    String name;
    constructorover()
    {
        System.out.println("Default Constructor");
    }
    constructorover(String nm,int rno){
       rollno=rno;
       name=nm;
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("Rollno: "+rollno);
    }
    public static void main(String args[]){
        constructorover ob1=new constructorover();
        constructorover ob2=new constructorover("Harshita",21052665);
        ob1.display();
        ob2.display();
    }
}
