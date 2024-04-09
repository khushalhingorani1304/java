// import java.util.*;

// public class april2 {
//     public static void main(String[] args) {
//         try {
//             double result = calculatePower(5, 4);
//             System.out.println("Result: " + result);
//         } catch (IllegalArgumentException e) {
//             System.out.println("Exception occurred: " + e.getMessage());
//         }
//     }

//     public static double calculatePower(int x, int y) {
//         if (x < 0 || y < 0) {
//             throw new IllegalArgumentException("Try non-negative inputs");
//         }
//         return Math.pow(x, y);
//     }
// }

public class april2 {
    public static void main(String[] args) {
        try {
            double result = calculatePower(5, 4);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static double calculatePower(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Try non-negative inputs");
        }
        return Math.pow(x, y);
    }
}





//! @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



// // 
// The Book class is used to store information about a book. A partial Book class definition is shown.
// public class Book 
// { 
// /** The title of the book */ 
// private String title; 
// /** The price of the book */ 
// private double price; 
// /** Creates a new Book with given title and price */ 
// public Book(String bookTitle, double bookPrice) 
// { /* implementation not shown */ } 
// /** Returns the title of the book */ 
// public String getTitle() 
// { return title; } 
// /** Returns a string containing the title and price of the Book */ 
// public String getBookInfo() 
// { 
// return title + "-" + price; 
// } 
// There may be instance variables, constructors, and methods that are not shown.
// } 
// You will write a class Textbook, which is a subclass of Book.
// A Textbook has an edition number, which is a positive integer used to identify different versions of the
// book. The getBookInfo method, when called on a Textbook, returns a string that also includes the
// edition information, as shown in the example.
// Information about the book title and price must be maintained in the Book class. Information about the
// edition must be maintained in the Textbook class.
// The Textbook class contains an additional method, canSubstituteFor, which returns true if
// a Textbook is a valid substitute for another Textbook and returns false otherwise. The current
// Textbook is a valid substitute for the Textbook referenced by the parameter of the
// canSubstituteFor method if the two Textbook objects have the same title and if the edition of the
// current Textbook is greater than or equal to the edition of the parameter