
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("Id is : "+this.id);
        System.out.println("Name is : "+this.name);
    }
}


public class oops_38_customClass {
    public static void main(String[] args) {
         System.out.println("This is our custom class");
         Employee harry = new Employee();
         harry.id = 5;
         harry.name = "Harry";

         harry.printDetails();
        
    }
}
