//! Throw keyword - used to throw user defined or customized exception onject to the JVM expilicitly

// public class lecture12 {
//     public static void main(String[] args) {
//         int age = 5;

//         if(age<18){
//             throw new InvalidageException("Not eligible for voting");
//         }
//         else{
//             System.out.println("Eligible voter!");
//         }
//     }
// }

// class InvalidageException extends RuntimeException{
//     public InvalidageException(String message) {
//         super(message);
//     }
// }


public class lecture12 {
    public static void main(String[] args) {
        throw new RajuException("TMKC");
    }
}

class RajuException extends RuntimeException{
    RajuException(String message){
        super(message);
    }
}

