import java.io.FileOutputStream;
import java.io.IOException;

public class april8{
    public static void main(String[] args) {
        try {
            FileOutputStream ob = new FileOutputStream("april8.txt");
            String s = "I am in java class";
            byte[]b = s.getBytes();
            ob.write(65);
            ob.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}