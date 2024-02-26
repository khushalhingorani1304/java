// *USER DEFINE EXCEPTION IN JAVA*
// ~HELLO~
// ? A CLASS WHICH INHERITS FROM ANY EXCEPTIoN CLASS IS KNOWN AS A USER DEFINed EXCEPTION CLASS! ?





// public class feb2603 {
//     static void checkAge(int age) throws Exception{
//         if(age<18){
//             throw new AgeException("AGE LESS THEN 18");
//         }
//         else{
//             throw new AgeException("Valid Age!");
//         }
//     }
//     public static void main(String[] args) throws Exception{
//         checkAge(17);
//     }
// }


public class feb2603 {
    static void checkAge(int age) throws Exception{
        if(age<18){
            throw new PowerException("AGE LESS THEN 18");
        }
        else{
            System.out.println("BYE");
        }
    }
    public static void main(String[] args) throws Exception{
        checkAge(17);
    }
}
