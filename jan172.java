public class jan172 {
    int a,b;
    jan172(){
        a = 0;
        b = 0;
    }

    jan172(int x,int y){
        a = x;
        b = y;
    }

    public String toString(){
        String s;
        s = "Jan172["+a+","+b+"]";
        return s;
    }
    public static void main(String[] args) {
        jan172 j1 = new jan172();
        jan172 j2 = new jan172(4,5);
        System.out.println(j1);
        System.out.println(j2);
    }
}
