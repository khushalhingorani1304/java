//! Nested Finally Block 

public class lecture10 {
    public static void main(String[] args) {
        try {
            int a = 10/2;
        } catch (Exception e) {
            System.out.println("catch block 1 run");
        }
        finally{
            try {
                int b = 10/0;
                System.out.println("minor try");
            } catch (Exception e) {
                System.out.println("minor catch");
            }
            finally{
                System.out.println("minor finally");
            }
        }
    }
}
