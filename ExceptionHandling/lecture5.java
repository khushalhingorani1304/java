//! Mulitiple Try Catch block - when more than one exception it will be used like multiple if else loop


public class lecture5 {
    public static void main(String[] args) {
        try{
            // int a = 10,b=0,c;
            int a = 10,b=2,c;
            c = a/b;
            System.out.println("Try block 1 executed");
        }
        catch(ArithmeticException e){
            System.out.println("Catch block 1 is executed");
        }
        try{
            // int arr[] = {10,20,30,40};
            int arr[] = {10,20,30,40,50,60};
            int x = arr[5];
            System.out.println("Try Block 2 is executed");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Catch Block 2 is executed");
        }
    }    
}
