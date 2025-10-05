package io.codeforall.bootcamp.exercise;

// Playground class declaration
public class Playground {
    // Main metho: static = belongs to the class itself, not to an object (can run without creating a Playground object)
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
        int[] numbers = {5, 10, 15};
        int[] doubled = myAi.doubleArray(numbers);

    }
}
