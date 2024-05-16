//! Nested Catch Blocks 

public class lecture8 {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }
        catch(Exception e){
            System.out.println(e);
            String a = null;
            try {
                System.out.println(a.toLowerCase());
            } catch (Exception d) {
                System.out.println(d);
            }
        }

        System.out.println("Normal Termination");
    }
}
