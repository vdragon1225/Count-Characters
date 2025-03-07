import java.util.Scanner; // import Scanner class

public class LabProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Declare Scanner

        // Declare a variable to hold number of times userChar appears
        int numTimes = 0;
        // Declare char and set it equal to user input
        char userChar = scan.next().charAt(0);

        // Declare a string and set it equal to user input
        String userString = scan.nextLine();

        // Use a for loop to iterate through string and check for userChar
        for (int i = 0; i <= userString.length() - 1; i++) {
            if (userString.charAt(i) == userChar) {
                numTimes++;
            }
        }

        // Use an if-else statement to ouput plural form if numTimes != 1
        if (numTimes == 1) {
            System.out.println("" + numTimes + " " + userChar); // Output singular form
        } else {
            System.out.println("" + numTimes + " " + userChar + "'s"); // Output plural form
        }

        scan.close(); // Close Scanner
    }
}
