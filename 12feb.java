// since java8 we can have method body in interface but we need to make it default method 
// Since java8 we can have static method in interface arc

// // interface canon{
// //     void print1();
        
    
// // }
// // interface acer{
// //     void print2();
// // }
// // class printing implements canon,acer{
// //     public void print(){
// //         System.out.println("Canon");
// //     }
// // }

// public class interfac {
//     // multiple inhereten is not present in java so to use it in java Interface is used
//     interface canon{
//         void print();
//     }

//     interface ace{
//         void print2();
//     }

//     static class printing implements canon, ace{
//         public void print(){
//             System.out.println("canon");

//         }
//         public void print2(){
//             System.out.println("ace");
//         }
//     }

//     public static void main(String[] args){
//         printing p = new printing();
//         p.print();
//         p.print2();
//     }

// }

public class 12feb{
    // multiple inhereten is not present in java so to use it in java Interface is used
    interface canon{
        void print();
    }

    interface ace{
        void print2();
    }

    static class printing implements canon, ace{
        public void print(){
            System.out.println("canon");

        }
        public void print2(){
            System.out.println("ace");
        }
    }
    public static void main(String[] args){
        printing p = new printing();
        p.print();
        p.print2();
    }


   }

//    Final keyword is used to restrict the users in java we can have final variable,final method and final class!
// Use:
// ->if a variable is defines final its value can not be changed later!
// ->if you make any method as final you cannot override it (function overloading cannot be possible)
// ->if you make any class as final ; it cannot extend(means inheritance is not possible)
// ->final method can be inherted ; but cannot be override
// ->We can initialize blank final variable in cunstructor only
// ->A static final variable that is not initialize at the time of declaration is known as static 
// it can be only initialized in static globe


public class feb1202{
    final int a;
    static final int b;
    feb1202(){
     a = 10;
    }
    static {
         b = 60;
    }
    public static void main(String []args){
        feb1202 f = new feb1202();
        System.out.println(f.a);
        System.out.println(b);
    }
}