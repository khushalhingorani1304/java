import java.util.Scanner;

public class jan15 {
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }

    int sum(){
        return a+b;
    }

    public static void main(String []x){
        jan15 ab1 = new jan15();
        jan15 ab2 = new jan15();
        ab1.input();
        ab2.input();
        System.out.println(ab2.sum());
        System.out.println(ab1.sum());
    }

    
    
    
}
