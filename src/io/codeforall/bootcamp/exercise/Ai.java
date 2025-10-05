package io.codeforall.bootcamp.exercise;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

// Ai class declaration
public class Ai {
    // instance variables declaration. private as will be used only in this class
    private String name;
    private String creationDate;

    // method constructor: used to initialize (set up) the object's properties
    public Ai(String name, String creationDate){
        this.name = name;
        this.creationDate = creationDate;
    }

    // Now we need to create methods that allow controlled access to your private variables.
    //Getters - methods that return the value of a property
    public String getName(){
        return this.name; // getter's job is to return what's stored. It doesn't need any input in the ()
    }
    public String getCreationDate(){
        return this.creationDate;
    }

    //Setters - methods that change the value of a property
    public void setName(String name) {
        this.name = name;
    }
    public void setCreationDate(String creationDate){
        this.creationDate = creationDate; // Void: just does something, doesn't give anything back
    }

    // method that takes an array of integers and returns a new array
    public int[] doubleArray(int[] numbers){
        int[] result = new int[numbers.length]; // create a new array with the same size
        for (int i = 0; i < numbers.length; i++) { // loop through each element
            result[i] = numbers[i] * 2; // multiply elements by 2
        }
        return result; // Return the new array
    }

    // factorialIterative — takes an int as an argument and returns the factorial of that int using an iterative approach
    // method signature
    public int factorialIterative(int n){
        int result = 1; // Start with 1 (multiplying by 0 would give 0)
        // Loop from 1 to n, multiplying each number
        for (int i = 1; i <= n; i++){
            result = result * i; // Multiply current result by i
        }
        return result; // Return the final factoria
    }

    // Calculates factorial using recursion (method calls itself)
    public  int factorialRecursive(int n){
        // Base case: stop when n is 1 or less
        if( n <= 1){
            return 1;
        }
        // Recursive case: n × factorial of (n-1)
        return n * factorialRecursive(n - 1); // Method calls itself with smaller number
    }

    // Palindrome check;
    // Check if a word is a palindrome (case-insensitive)
    public boolean isPalindrome(String word){
        String lowerWord = word.toLowerCase(); // Convert to lowercase
        String reversed = ""; // Will hold the reversed word
        // Build the reversed string
        for ( int i = lowerWord.length() - 1; i >= 0; i--){
            reversed = reversed + lowerWord.charAt(i);
        }
        // Compare original with reversed
        return lowerWord.equals(reversed);
    }
    // Main method: replaces ALL palindrome words in a sentence
    public  String palindromeReplace(String text){
        // 1. Split sentence into individual words
        String[] words = text.split(" ");
        // 2. Check each word
        for (int i = 0; i < words.length; i++){
            // 3. If word is palindrome, replace it
            if (isPalindrome(words[i])){
                words[i] = "palindrome";
            }
        }
        return String.join(" ",words); // 4. Join words back into a sentence
    }

    // email validator using Regex patterns
    // This method DOESN'T need input (just returns a pattern)
    public String emailValidator(){
        return "[a-zA-Z0-9.#]+@[a-zA-Z0-9.]+";
    }
}

