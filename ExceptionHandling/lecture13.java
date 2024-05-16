//! THROWS keyword - used when we dont want to handle the exception and try to send the exception to the jvm 


//! can only be used in Checked exceptions Not Unchecked;

public class lecture13 {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
