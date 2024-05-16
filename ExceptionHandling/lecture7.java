//! Nested Try Block just like nested "For loop"


public class lecture7 {
    public static void main(String[] args) {
        try{
            int a = 10/2;
            System.out.println("1");            
            try{
                System.out.println("2");
                String b = null;
                b.toLowerCase();
                System.out.println("3");
            }
            catch(NullPointerException n){
                System.out.println(n);
            }
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }

        System.out.println("--------> Normal Termination <--------");
    }        
}
