package io.codeforall.bootcamp.exercise;

// Playground class declaration
public class Playground {
    // Main method: static = belongs to the class itself, not to an object (can run without creating a Playground object)
    public static void main(String[] args){ //String[] args = can accept command-line arguments
        // Creating an Object; Ai = the type (class name); myAi = the variable name (you choose this)
        // new Ai(...) = calls your constructor to create a new Ai object
        Ai myAi = new Ai("Chatbot", "2025-10-04"); // the two String arguments your constructor needs
        //Real-life analogy: Like ordering a custom cake: you specify what you want (name and date), and you get back a cake object (myAi)

        // Test and display results
        // Using Getters: myAi.getName() = calls the getter method on your object
        // The . (dot) means "access something inside this object"
        System.out.println("Ai name: " + myAi.getName()); // Returns the name and prints it
        System.out.println("Creation Date:" + myAi.getCreationDate()); // Returns the date and prints it

        // Testing doubleArray
        int[] numbers = {5, 10, 15}; // Create an array with some numbers
        int[] doubled = myAi.doubleArray(numbers); // pass is to my doubleArray method and get back a new array as result
        System.out.println("Double array: " + java.util.Arrays.toString(doubled)); // java.util is the package where the Arrays class lives

        // testing factorials
        // iterative
        System.out.println("4! iterative: " + myAi.factorialIterative(4));
        // recursive
        System.out.println("5! recursive: " + myAi.factorialRecursive(5)); //Call each factorial method with the number 5. Print the results directly (no need to store in a variable)

        // testing palindrome
        String text = "Hello I am testing abba"; // Create a test string with some palindromes
        System.out.println("Palindrome replace: " + myAi.palindromeReplace(text)); // Pass it to your palindromeReplace method.Print the result (palindromes replaced with "palindrome")

        // testing email validator
        System.out.println("Email regex: " + myAi.emailValidator()); // myAi.emailValidator() - calls the method
    }
}
