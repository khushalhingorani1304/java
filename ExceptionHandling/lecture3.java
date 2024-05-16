//! Try block and catch block; 

// public class lecture3 {
//     public static void main(String[] args) {
//         try{
//             int a = 10,b=0,c;
//             c = a/b;
//             System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         finally{
//             System.out.println(a);
//         }
//     }
// }


//! Number Format Exception;

// public class lecture3{
//     public static void main(String[] args) {
        
//         String str = "khushal";
//         //! String str = "123";
        

//         try{
//             System.out.println("Main method started");
//             int a = Integer.parseInt(str);
//             System.out.println(a);
//         }
//         catch(NumberFormatException nfe){
//             System.out.println(nfe);
//         }
//         System.out.println("Main method ended");
//     }
// }


//! example


public class lecture3 {
    public static void main(String[] args) {
        int a;
        try{
            a=10;
            int b = 0,c;
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(a);
    }

}