// abstract class bank2{


//     bank2(){
//         cout<<"Conctr"
//     }

//     abstract void speed();
//     void brake(){
//         System.out.println("Break");
//     }

// };

// class Honda extends bike{
// void speed(){
//     System.out.println("speed");
// }


// public static void main(String[] args) {
//     bike b = new Honda();
//     b.brake();
//     b.speed();
// }    
// }

abstract class krish{
    abstract void hello();
} 
abstract class krish2 extends krish{
    abstract void disp2();
}
class krish4 extends krish2{
    void hello(){
        System.out.println("Hello");
    }
    void disp2(){
        System.out.println("Disp");
    }
}
class feb8 {
    public static void main(String args[]){
        krish k1 = new krish4();
        k1.hello();
        // k1.disp2();


    }
}