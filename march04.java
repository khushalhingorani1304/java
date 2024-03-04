
public class march04 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("SUN");


        for(int i = 0;i<sb.length();i++){
            for(int j = i;j<sb.length();j++){
                System.out.println(sb.replace(i, j,sb.substring(i,j)));
            }
        }


        // System.out.println(sb.length());
        // System.out.println(sb.capacity());


        // sb.append("UNIVERSITY");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        
        
        // sb.insert(0,"I study in ");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());


        // sb.replace(1, 3, " KYA HI LIKHU s");
        // System.out.println(sb);
        // System.out.println(sb.capacity());
    
        
        // sb.delete(1, 14);
        // System.out.println(sb);
        // System.out.println(sb.capacity());
    


        // sb.reverse();
        // System.out.println(sb);

        // System.out.println(sb.charAt(5));


       
        // System.out.println(sb.substring(11));
        // System.out.println(sb.substring(11,20));

    }   
    
}

