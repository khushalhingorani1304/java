public class PowerException extends Exception{
    String s;
    PowerException(String s)
    {
        this.s = s;
    }

    public String StringtoString(){
        return s;
    }
}
