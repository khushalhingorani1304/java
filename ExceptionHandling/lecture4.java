
//! Checking The flow of try catch finally working 


public class lecture4 {
    public static void main(String[] args) {
        try
        {
            System.out.println("Statement 1");
            int a = 10,b;
            b = a/0;
            System.out.println(b);
            System.out.println("Statement 2");
        } 
        catch(ArithmeticException e)
        {
            int c = 10/0;
            System.out.println("Statement 3");
        }
        finally
        {
            int z = 10/0;
            System.out.println("Statement 4");
        }
        System.err.println("Statement 5");
    }
}
