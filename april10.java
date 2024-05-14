// civilisation in java :- 
// serialisation :- it is a process of writing object in byte string 
// deserialisation:- the reverse process of serialisation
// for serialising the object we use write object method of object output string class 
// for deserialising we use the readobject method of object input string class 

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class apr11 implements Serializable {
    public int roll;
    public String name;
    public apr11() {
        this.roll = 0;
        this.name = "";
    }
    public apr11(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    @Override
    public String toString() {
        return "student [roll=" + roll + ", name=" + name + "]";
    }
    
    


}
class civilisation {
    public static void main(String x[]){
        apr11 ob1 = new apr11(2,"abc");
        FileOutputStream ob12 = new student12(2,"abc");
        ObjectFileOutputStream f = new FileOutputStream("MPtxt");
        ObjectOutputStream k = new ObjectOutputStream(f);
        k.writeObject(ob12);


    }
    
}