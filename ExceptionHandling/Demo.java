package ExceptionHandling;

// there are two types of exception:-
/*  1) Unchecked exception( occurs at runtime exception) : not compulsary to handle
    2) Checked exception (occurs at SQ exception) : compulsary to handle */

    class MyException extends Exception{  // custom checked exception
        public MyException(String string){
            super(string); // calling Exception class's constructor
        }
    }
    class MyException2 extends RuntimeException{  // custom Unchecked exception
        public MyException2(String string){
            super(string); // calling Exception class's constructor
        }
    }

public class Demo {
    public static void main(String[] args) {
      
        int i = 1;
        int j = 1;
        int num = 0;

        // these all are runtime exceptions:

        try{
             num = i / j;
             if(num == 1)
                throw new MyException("be in the limit"); // throws the custom exception.

                throw new ArithmeticException("hey be careful");  // "throw" keyword is used to throw the excepiton and call the arithmetic catch block.
                                                  // whenever "throw" is used you have to create an object of the exception you are calling as you can see here.
            
        }

        catch(MyException e){
            System.out.println("be careful" + e);
        }

        catch(ArithmeticException e){ // this exception is only specific for arithmetic problems
            num = i/1;
            System.out.println("enter a valid number" + e);
        }

        catch(Exception e){  // this is the parent class in exceptions and it should always be at the last among the exceptions as it handles every exception
            System.out.println("something went wrong..."+ e);
        }
        
        // System.out.println(num)

        System.out.println("hi");
    }
}
