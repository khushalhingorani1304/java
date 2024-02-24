// in java using a try block inside another try block is known as 
// nested try block

// Sometime a situation may rise where a part of block make one error
//  and a entire block itself make another error in such case exception 
// handlee should be nested;


// when any inner try block does not have a catch block for particular exception 
// then the catch block of outer try block are checked for the exception and 
// if it matches the catch block of outer try block gets execute;


// Throw keyword is used to to throw an exception explicitly 



// The finally block will not be excexuted if the program exit either by calling System.exit or by causing a fatal error that causes the program stopping abnormally 

import java.util.Scanner;

/**
 * feb2001
 */
public class feb2001 {

    public static void main(String[] args) {
        // try{
        //     int a[] = {1,2,3};
        //      a[4] = 3/0;
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     e.printStackTrace();
        //     System.out.println(e);
        // }
        // catch(ArithmeticException e){
        //     e.printStackTrace();
        //     System.out.println("Arithmetic run hua hai");
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        //     System.out.println("Exception run hua hai");
        // }
        // finally{
        //     System.out.println("Finally ke andar aagya");
        // }


        // System.out.println("bye");


        // try{
        //     int a = 3/0;
        //     try{
        //         String s = null;
        //         System.out.println(s.length());
        //     }
        //     catch(ArithmeticException e){
        //         System.out.println("Inner Catch");
        //     }
        // }
        // catch(Throwable e){
        //     System.out.println("Outer catch");
        // }
        

        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>18){
            System.out.println("Eligible for voting!");
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Not Eligible For Voting!");
        }
        
    }
}