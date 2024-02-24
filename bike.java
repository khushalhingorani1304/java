abstract class bike{
    abstract void speed();
        void brake(){
            System.out.println("Break");
        }
    
};

class Honda extends bike{
    void speed(){
        System.out.println("speed");
    }


    public static void main(String[] args) {
        bike b = new Honda();
        b.brake();
        b.speed();
    }
}
