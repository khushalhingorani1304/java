//! Difference between Throws and throw keyword

// public class lecture14 {
//     public static void main(String[] args) {
//         try {
//             checkAge(15);
//         } catch (Exception e) {
//             System.out.println("Caught an exception: " + e.getMessage());
//         }
//     }

//     static void checkAge(int age) {
//         if (age < 18) {
//             throw new IllegalArgumentException("Age must be at least 18");
//         } else {
//             System.out.println("Age is valid");
//         }
//     }
// }


import java.io.IOException;

public class lecture14 {
    public static void main(String[] args) {
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }

    static void processFile() throws IOException {
        validateFile("");
    }

    static void validateFile(String filename) throws IOException {
        if (filename == null || filename.isEmpty()) {
            throw new IOException("Filename cannot be empty");
        }
        // Additional file validation logic
    }
}
