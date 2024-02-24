// Exception handling
// Defination of exception - runtime error id known as exception  eg: Divide by 0;
// Types of java exception:-
// 1. Unchecked Exception - error that are checked at the runtime;
// examples:
// a. Arithmetic Exception: int a = 30/0;

// b. Null Pointer Exception: string s = NULL;
//                            SOP(s.length());

// c. Number Format Exception: string s = "abc";
//                            int a  = Integer.parsInt(s);

// d. Array Index Out Of Bound Exception: int a[] = new int[5];
//                                         a[6] = 60;

// e. String Index Out Of Bound Exception: string s = "ABCD";
//                                         s[5] = V;


// All classes related to exception handling are present in java.lang.package;


// Throwable is a base class for all excepion in java;
// Error in throwable : Virtual Machine Error: Out of memory error: Stack Overflow Error;
// Exception in THrowable: I/O exception: sql exception: Class Not Found:Runtime Exception;



// To handle exception in java we have 5 keywords : Try , Catch ,Throw(Explicit Exception) ,Throws(Explicit Exception) , Finally; 
// If user will not tackel exception in java then jvm will automatically handle the error and stop excecution of the code where it find the error;






/**
 * 19feb
 */
import java.lang.Package;
public class feb19{


    public static void main(String args[]){

        System.out.println("HELLO");

        try{
            int a = 30/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }


        try{
            String s = null;
            System.out.print(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }




        try{
            String s = "abc";
            int a  = Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }




        try{
            int a[] = new int[5];
            a[6] = 60;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }




        try{
            String s = "ABCD";
            System.out.println(s.charAt(5));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }



        System.out.println("Bye");
    }
}