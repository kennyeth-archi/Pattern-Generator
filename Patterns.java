// Kenneth Running
// November 6, 2026
// A class that generates various text-based patterns using different types of selection structures and loops in Java

public class Patterns {

    public static void main(String[] args) {
        System.out.println("--- *.+ Testing stars +.* ---");
        System.out.println();
        stars(7);
        System.out.println();

        System.out.println("---- Testing triangle |>  ---");
        System.out.println();
        triangle(9);
        System.out.println();

        System.out.println("-------- Testing odds -------");
        System.out.println();
        odds(9);
        System.out.println();

        System.out.println("----- Testing eo (Even) -----");
        System.out.println();
        eo(6);
        System.out.println();

        System.out.println("------ Testing eo (Odd) -----");
        System.out.println();
        eo(5);
        System.out.println();

        System.out.println("------ Testing pyramid ------");
        System.out.println();
        pyramid(5);
        System.out.println();
    }

  
    // Pre-condition: rows must be a non-negative integer
    // Post-condition: Prints an increasing triangle of stars using only while loops
 
    public static void stars(int rows) {
        int i = 0;
        while (i < rows) {
            int j = 0;
            int numStars = 2 * i + 1;
            while (j < numStars) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Pre-condition: rows must be a non-negative integer
    // Post-condition: Prints a numeric triangle 

    public static void triangle(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Pre-condition: start must be a positive odd integer
    // Post-condition: Prints a sequence of rows using for loops, starting from the value of 'start' down to 1

    public static void odds(int start) {
        for (int i = start; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Pre-condition: maxRow must be a positive integer representing the maximum repetition in the middle row
    // Post-condition: Prints a diamond pattern alternating 'O' and 'E' characters. If maxE is odd, the pattern starts with 'E'. If maxE is even, the pattern starts with 'O'
    public static void eo(int maxRow) {
        boolean startWithE = (maxRow % 2 != 0);
        
        // Upper half including the middle row
        for (int i = 1; i <= maxRow; i++) {
            char charToPrint;
            if (startWithE) {
                charToPrint = (i % 2 != 0) ? 'E' : 'O';
            } else {
                charToPrint = (i % 2 != 0) ? 'O' : 'E';
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print(charToPrint);
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = maxRow - 1; i >= 1; i--) {
            char charToPrint;
            if (startWithE) {
                charToPrint = (i % 2 != 0) ? 'E' : 'O';
            } else {
                charToPrint = (i % 2 != 0) ? 'O' : 'E';
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print(charToPrint);
            }
            System.out.println();
        }
    }

    // Pre-condition: rows must be a positive integer
    // Post-condition: Prints a centered numeric pyramid 
    
    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces to center align the pyramid
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
            
            // Print the numbers
            int numCount = 2 * (rows - i) + 1;
            for (int j = 0; j < numCount; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


