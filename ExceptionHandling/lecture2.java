// Exception hierarchy
// Null pointer Exception!

public class lecture2 {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.toLowerCase());
        }catch(NullPointerException e){
            System.out.println(e);
        }    
    }
}
