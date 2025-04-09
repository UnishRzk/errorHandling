package Throws;

class B {
    public void show() throws ClassNotFoundException {
        // Directly throw the exception if the class is not found
        Class.forName("Throwd");
    }
}

public class Implementation {
    public static void main(String[] args) {
        B obj = new B();

        // Declare that main might throw the exception
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find the class");
        }
    }
}
