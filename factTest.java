class factfind 
{
    long ans = 1;
    long factorial(int x){
        int k = 1;
        while(k!=x){
            ans = ans*(++k);
        }
        return ans;
    }  



    double remainder  = 0;
    double i = 0;
    boolean palindrome(int x){
        int ans1 = x;
        while(x!=0){
        double a = x%10;
        remainder = remainder*10+a;
        x =x/10;
        }
        if(remainder == ans1){
            return true;
        }
        else{
            return false;
        }
    }
}

public class factTest {
    public static void main(String []x) {
        factfind obj1 = new factfind();
        System.out.println(obj1.factorial(5));
        System.out.println(obj1.palindrome(121));
    }
}
