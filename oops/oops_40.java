//! constructors in Java
import java.util.*;

class Game{
    private int noOfGuesses = 0;
    private int random;
    int userInput;
    Random randomInt = new Random();
    Scanner sc = new Scanner(System.in);

    public Game(){
        random = randomInt.nextInt(100);
    }

    public void takeUserInput(int x){
        userInput = x;
    }

    public boolean isCorrectNumber(int userInput){
        if(userInput==random){
            return true;
        }
        else if(userInput>random){
            noOfGuesses++;
            System.out.println("Think of a short no.");
            return false;
        }else{
            noOfGuesses++;
            System.out.println("Think of a larger no.");
            return false;
        }
    }

    public void getNoOfGuesses() {
        System.out.println("No of guesses : "+this.noOfGuesses);
    }

    public void playAgain(){
        this.playGame(false);
    }

    public void playGame(boolean flag){
        while (!flag) {
            int x = sc.nextInt();
            this.takeUserInput(x);
            flag = this.isCorrectNumber(this.userInput);
        }

        this.getNoOfGuesses();

        System.out.print("Do you wanna play again(Y/N) : ");
        String str = sc.next();
        if(str.equals("Y")==true){
           this.playAgain();
        }
    }

}

public class oops_40 {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.playGame(false);
    }   
}
