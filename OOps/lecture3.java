import java.security.PublicKey;

public class lecture3 {
    public static void main(String[] args) {
        boxw obj = new boxw(2,4,6,8);
        obj.info();
        // obj.w
    }
}

class box {

    double h;
    double w;
    double l;
    
    box(){
       this.h = -1; 
       this.w = -1; 
       this.l = -1; 
    }

    box(double side){
        this.h = side;
        this.w = side;
        this.l = side;
    }

    box(double h,double w,double l){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    box(box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void info(){
        System.out.println("height : " + h);
        System.out.println("width : " + w);
        System.out.println("length : " + l);
    }
}

class boxw extends box{
    double weight;
    boxw(){
        this.weight = -1;
    }
    
    boxw(double h,double w,double l,double weight){
        // this.h = h;
        // this.w = w;
        // this.l = l;
        super(h,w,l);
        this.weight = weight;
    }
    
    public void info(){
        System.out.println("height : " + h);
        System.out.println("width : " + w);
        System.out.println("length : " + l);
        System.out.println("weight : " + weight);
    }
}
