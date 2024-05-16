//^  Mulitple Catch Blocks


public class lecture6 {
    public static void main(String[] args) {
        try{
            //! ArithmeticException 
            int a = 10/2;
        
            //! Array out of index 
            int b[] = {1};
            System.out.println(b[0]);


            //! NullPointer
            String k = null;
            k.toLowerCase();
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        // catch(NullPointerException e){
        //     System.out.println(e);
        // }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Normal");
    }    
}
