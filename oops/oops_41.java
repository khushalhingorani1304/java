//! Inheritance in java

class base{
    int x;
    public void print(){
        System.out.println("hello");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    
}


public class oops_41 {
    public static void main(String[] args) {
        derived b = new derived();
        b.setX(5);
        System.out.println(b.getX());
    }
}
