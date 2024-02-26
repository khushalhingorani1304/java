// **JAVA EXCEPTION PROPAGATION**

// -> by default unchecked exception in a calling chain
// -> by default checked exception are not forwarded in a calling chain


public class feb2602 {
    void m() throws Exception{
        // int a = 3/0;
        // throw new ArithmeticException("Age less then 18");
        throw new Exception("Age less then 18");
    }

    void n()throws Exception{
        m();
    }

    void p() throws Exception{
        try{
            n();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception{
        feb2602 ob = new feb2602();
        ob.p();
        System.out.println("HELLO JI KI HAAL CHAAL !");
    }
}
