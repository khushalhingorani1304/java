//! Mechanism

// class lecture1{
//     public static void main(String[] args) {
//         int a = 10,b = 0,c;
//         c = a/b;   //!Ye line mai exception hai iske aage ka code excecute nhi oga yhi terminate ho jaayega bss
//         System.out.println(c);
//     }
// } 

//! To overcome this exception we will use try catch block

class lecture1{
    public static void main(String[] args) {
        int a=10,b=0,c;
        try{
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            // System.out.println("Exception : can devide by Zero!");
            System.out.println(e);
        }
        finally{
            System.out.println("Mai toh chalunga hee!");
        }
    }
}