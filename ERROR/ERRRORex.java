package ERROR;

public class ERRRORex {  
    // Example 1: StackOverflowError  
    public static void recursiveCall() {  
        recursiveCall(); // Infinite recursion  
    }  
  
    public static void main(String[] args) {  
        try {  
            recursiveCall();  
        } catch (StackOverflowError e) {  
            System.out.println("Caught StackOverflowError: " + e.getMessage());  
        }  
  
        // Example 2: OutOfMemoryError  
        try {  
            int[] largeArray = new int[Integer.MAX_VALUE]; // Request too much memory  
            System.out.println("Allocated array with length: " + largeArray.length);
        } catch (OutOfMemoryError e) {  
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());  
        }  
    }  
}  