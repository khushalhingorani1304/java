// Constructor is a specialFunction in class having a same name that of class 
// It is called automatically when instance of class is created
// At the time of calling constructor memory for a object is allocaated in the memory
// every time an object is created using new keyword at least one constructor is called

// There are 2 types of cunstructor in java
// 1.non argument or Default
// parametrized


// java constructor can not be static,abstract,final and synchronized

// We can have access modifiers while creating a constructor
// We can have PUBLIC,PRIVATE,PROTECTED,DEFAULT constructors in java


// Java Copy costructor - there is no copy constructor in java but we have 3 different ways to copy the values of one object in another object
// BY constructor
// By assigning the value to other
// By clone method of a object class

public class jan16{
    int a,b;
    public jan16(){
        a=10;
        b=20;
    }

    jan16(int x,int y){
        a = x;
        b = y;
    }

    // Method 1
    jan16(jan16 t){
        a = t.a;
        b = t.b;
    }





    void display(){
        System.out.println(a+" "+b);
    }


    public static void main(String[] args) {
        jan16 j1 = new jan16(5,999);
        jan16 j2 = new jan16();
        j1.display();
        j2.display();

        jan16 j3 = new jan16(j1);
        j3.display();

        jan16 j4 = new jan16();
        j4.display();
        j4.a = j1.a;
        j4.b = j1.b;
        j4.display();
    }
}



