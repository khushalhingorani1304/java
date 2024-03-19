// class Person implements Comparable<Person> {
//     private int age;
//     private int marks;
//     private String name;

//     // Default Constructor
//     public Person() {
//     }

//     // Parameterized Constructor
//     public Person(int age, int marks, String name) {
//         this.age = age;
//         this.marks = marks;
//         this.name = name;
//     }

//     // Getters and Setters
//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public int getMarks() {
//         return marks;
//     }

//     public void setMarks(int marks) {
//         this.marks = marks;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     // Comparable Interface Implementation
//     @Override
//     public int compareTo(Person otherPerson) {
//         // Implement your comparison logic here
//         // For example, compare based on age
//         return Integer.compare(this.age, otherPerson.age);
//     }
// }
// public class march18 {
//     public static void main(String[] args) {
//         Person p1 = new Person();
//         Person p2 = new Person(1,1,"ABQ");
//         Person p3 = new Person(2,2,"CD");
//        System.out.println(p2.getAge()+" "+ p2.getMarks()+" "+p2.getName());
//         System.err.println(p3.compareTo(p2));


//     }
// }
// comparable interface is used to order the object of user defined class this interface i sfound int he java.lang package
// this interface contains only one method named compareTo(<object>) it provides a single sorting sequence only 
/*
 * this means you can sort elements on the basis of single data member only for eg rool no , age , name
 * 
 */


 import java.util.*;
import java.lang.*;
class person1 implements Comparable <person1>{
    private String name;
    private int age;
    private double marks;
    
    
    public person1() {
        this.name=" ";
        this.age=0;
        marks=0;
    }
    public person1(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "person1 [name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }
    public int compareTo(person1 ob){
        return age = ob.age;
        
    }
    



}
class comparableinterface {
    public static void main(String[] args) {
        person1 p1 = new person1("ravi",15,6.8);
        person1 p2 = new person1("suman",18,7.3);
        person1 p3 = new person1("ravi" , 15 , 7.3);
        person1 p4 = new person1("raman" , 18 , 6.8);
        person1 p5 = new person1("Suman" , 15 , 9.1);

        ArrayList <person1> al = new ArrayList<person1>();
        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        al.add(p5);
       System.out.println("Printing the array list:");
    

    for(Object l:al){
        System.out.println(l);
    }
    System.out.println("printng the sorted array list:");
    Collections.sort(al);
    for(Object k:al){
        System.out.println(k);
}
}
}


 