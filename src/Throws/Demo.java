package Throws;

class A{
    public void show(){
        try{
            Class.forName("Thro");
        }
        catch (ClassNotFoundException e){
            System.out.println("Not able to find the class");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
