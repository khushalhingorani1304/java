// -> Every sub class of error and runtime exception is an unchecked exception in java! 
// -> a checked exception is everything else under the throwable class!
// -> if we throw a checked exception then it is must to handle the exception using catch block or the method must declared it throws
//  declarations.

// 




// public class feb2601 {

//     public static void main(String[] args) {
//         try{
//             throw new Exception("ERROR");
//         }

//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }


public class feb2601 {

        public static void main(String[] args) throws Exception{
            
            throw new Exception("ERROR");
     
        }
    }