// import java.util.*;
// public class march14 {
//     public static void main(String args[]){
//         ArrayList <Integer> ob = new ArrayList<Integer>();
//         ob.add(5);
//         ob.add(10);
//         ob.add(60);
//         System.out.println(ob);
//         ob.add(0,90);
//         System.out.println(ob);
//         ob.add(4,89);
//         System.out.println(ob);
//         for(int x:ob){
//             System.out.print(x);
//             System.out.print(" ");
//         }
//         ob.get(0);
//         ob.set(0,55);
//         for(int i = 0 ;i<ob.size();i++){
//             System.out.print(ob.get(i));
//             System.out.print(" ");
//         }
//         System.out.println();
//         System.out.println(ob.lastIndexOf(60));
//         ArrayList <String> ob1 = new ArrayList<String>();
//         ob1.add("ab");
//         ob1.add("bc");
//         ob1.add("cd");
//         ob1.add(0,"de");
//         ob1.add(1,"ef");
//         for(String x:ob1){
//             System.out.print(x);
//             System.out.print(" ");
//         }
//         for(int i = 0;i<ob1.size();i++){
//             System.out.print(ob1.get(i));
//             System.out.println(" ");
//         }
//         Iterator itr = ob1.iterator();
//         while(itr.hasNext()){
//             System.out.print(itr.next());
//             System.out.print(" ");
//         }
//         System.out.println();
//         Object k[] = ob1.toArray();
//         for(Object o : k){
//             System.out.print(o);
//             System.out.print(" ");
//         }
//         System.out.println();
//         System.out.println(ob1.contains("bc"));
//         Collections.sort(ob1);
//         for(String x : ob1){
//             System.out.print(x);
//             System.out.print(" ");
//         }
//         System.out.println();
//         Collections.sort(ob1,Collections.reverseOrder());
//         for(String x:ob1){
//             System.out.print(x);
//             System.out.print(" ");
//         }


        
        
//     }
    
// }


import java.util.*;
class a4{
    private int age;
    private String name;
    private int marks;
    public a4(){
        age = 0;
        name = null;
        marks = 0;
    }
    public a4(int age, String name, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    

}
public class march14 {
    public static void main(String args[]){
        ArrayList<a4> al = new ArrayList<a4>();
        a4 o1 = new a4();
        a4 o2 = new a4(23,"Av",91);
        a4 o3 = new a4(11,"bc",80);
        o1.setName("sam");
        o1.setAge(10);
        o1.setMarks(96);
        System.out.println(o2);
        al.add(o1);
        al.add(o2);
        al.add(o3);
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }


        


        }
}