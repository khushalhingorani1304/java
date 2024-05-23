//! Practice Set

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return this.salary;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}


class Cellphone{
    public void ring(){
        System.out.println("Ringing....  ");
    }

    public void vibrate(){
        System.err.println("Vibrating....  ");
    }

    public void callFriend(){
        System.err.println("Calling Khushal!");
    }
}



class Square{
    int side;

    Square(){
        side = 0;
    }

    Square(int side){
        this.side = side;
    }

    public int area(){
        return this.side*this.side;
    }

    public int perimeter(){
        return 4*this.side;
    }
}

class Rectangle{
    int length,breadth;

    Rectangle(){
        length = breadth = 0;
    }

    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return this.length*this.breadth;
    }

    public int perimeter(){
        return 2*(this.length+this.breadth);
    }
}



public class oops_39 {
    public static void main(String[] args) {
        
        //! Problem 1
        // Employee e1 = new Employee();
        // e1.name = "Khushal";
        // e1.salary = 1000;

        // String name = e1.getName();
        // int salary = e1.getSalary();

        // System.out.println(name+"  "+salary);

        // e1.setName("Sindhi");

        // System.out.println(e1.name+"  "+e1.salary);



        //! Problem 2

        // Cellphone Samsung = new Cellphone();

        // Samsung.ring();
        // Samsung.vibrate();
        // Samsung.callFriend();


        // !Problem 3

        // Square a = new Square(5);
        // int area = a.area();
        // int perimeter = a.perimeter();

        // System.out.println(area+"   "+perimeter);



        //! Problem 4


        Rectangle R1 = new Rectangle(10,5);
        int area = R1.area();
        int perimeter = R1.perimeter();

        System.out.println(area+"   "+perimeter);


    }    
}
