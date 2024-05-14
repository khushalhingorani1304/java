/**
 * lecture2
 */
public class lecture2 {
    public static void main(String[] args) {
    
        Human a = new Human(18, "Khushal Hingorani", 10000);
        System.out.println(Human.population);
        Human b = new Human(19, "Khush", 10000);
        System.out.println(Human.population);
        lecture2 obj = new lecture2();
        obj.fun();
        // fun();

    }
    
    void fun(){
        System.out.println("Hello");
    }
}


class Human{
    int age;
    String name;
    long salary;
    static long population;

    Human(int age,String name,long salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
    
}


