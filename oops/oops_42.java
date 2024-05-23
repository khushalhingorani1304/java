//! Constructors with inheritance in java
//^ Super Class!!



class base{

    base(){
        System.out.println("I am a constructor!");
    }

    base(int x){
        System.out.println("I am a constructor with a value of x : "+x);
    }

}

class derived extends base{

    derived(){
        // super(8);
        System.out.println("I am constructor 2.0");
    }

    derived(int x,int y){
        super(x);
        System.out.println("I am cunstructor 2.0 with value of y : "+y);
    }

}

class childOfDerived extends derived{
    childOfDerived(){
        System.out.println("I am cunstructor 3.0");
    }

    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am cunstructor 3.0 with value of z : "+z);
    }
}



public class oops_42 {
    public static void main(String[] args) {
        // base b1 = new base();
        // derived d1 = new derived();
        // derived d1 = new derived(8,5);
        // childOfDerived cod1 = new childOfDerived();
        childOfDerived cod1 = new childOfDerived(1,2,3);
    }   
}
