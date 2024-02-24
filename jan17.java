// 1. "THIS" is used to refer the curent class instance variable
// 2. "THIS" can be used to invoke current class method
// 3. "THIS" can be used to invoke current class constructor
// 4. "THIS" can be passed as an argument in an method call;
// 5. "THIS" can be passed as an argument in an constructor call;
// 6. "THIS" can be used to return to current class instance from the method;

public class jan17 {
    int a ,b;
    jan17(){
        a = 10;
        b = 20;
    }

    jan17(int a ,int b){
        this.a = a;
        this.b = b;
        display();
        this.display();
        System.out.println("-------");
    }


    void display(){
        // System.out.println(a+" "+b);
        System.out.println(this.a+" "+this.b);
    }

    public static void main(String[] args) {
        jan17 j1 = new jan17(5,4);
        // j1.display();

        
    }
}
