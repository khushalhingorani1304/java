import java.io.File;
import java.io.IOException;

public class april9 {
    public static void main(String[] args) {
        try {
            File f = new File("src/Basic/fileHandling");
            String[] s= f.list();
            for(String k:s){
                System.out.print(k+" ");
            }
            System.out.println();
            File[] file = f.listFiles();
            for(File i:file){
                System.out.println(i.getName()+" "+i.canWrite()+" "+i.length()+" "+i.isHidden());
            }
        }  
        catch (Exception e){
            System.out.println(e);
        }

    }
}

