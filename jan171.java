
public class jan171 {

    jan171(){
        this(6.3f);
        System.out.println("No argument const");
    }

    jan171(float x){
        // this();
        System.out.println(x);
    }


    public String toString(){
        String X = "WELCOME";
        return X;
    }

    public static void main(String[] args) {
        jan171 j1 = new jan171();
        System.out.println("-----------");
        jan171 j2 = new jan171(4);
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j2);
    }
    
}