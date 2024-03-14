import java.util.ArrayList;

public class march13 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(90);
        a.add(6);
        a.add(8);
        a.add(90);
        a.add(9);
        a.add(90);
        System.out.println(a);

        for(int k : a ){
            System.out.println(k);
        }

        System.out.println(a.size());
        // a.clear();
        // System.out.println(a);
        // System.out.println(a.size());
        
        a.remove(1);
        System.out.println(a);
        System.out.println(a.size());

        a.set(1, 100);
        System.out.println(a);

        System.out.println(a.get(1));


        for(int i = 0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }

        System.out.println();


        System.out.println(a.indexOf(5));
        System.out.println(a.lastIndexOf(5));



        for(int i = 0;i<a.size();i++){
            if(a.get(i)==90){
                System.out.print(i+" ");
            }
        }


    }
}