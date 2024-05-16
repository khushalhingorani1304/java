public class lecture15 {
    
    public static void Wait() throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(100);
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        Wait();  
        System.out.println(10/0);
        System.out.println("Normal Termination");  
    }
}


//& isme main method mai 2 exception hai isliye error dega isliye best cheez hai ki try catch use kare humesha in the main method