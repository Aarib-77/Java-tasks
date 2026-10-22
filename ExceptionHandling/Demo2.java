package ExceptionHandling;

// About "throws" keyword
// this keyword is used when the exception should be handled by the caller and not by the method itself.

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        
        A obj = new A();

        try{
            obj.show();
        }
        catch (ClassNotFoundException e){
           e.printStackTrace();
        }
    }
}
