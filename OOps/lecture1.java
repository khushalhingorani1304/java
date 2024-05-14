// package OOps;

class lecture1{
    public static void main(String[] args) {
        Student khushal = new Student();
        khushal.display();
        Student vinay = new Student(102,"Vinay",89.66f);
        vinay.display();
    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
       this(101,"default person",100.0f);
    }

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}