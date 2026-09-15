// Custom Exception Class
class InvalidISBNException extends Exception {
public InvalidISBNException(String message) {
super(message);
}
}
// Main class
public class ExceptionDemo {
// Method to validate ISBN length
static void validateISBN(String isbn) throws InvalidISBNException {
if (isbn == null || isbn.length() != 13) {
throw new InvalidISBNException("Invalid ISBN: Length must be exactly 13 characters.
(Given length: " + (isbn == null ? 0 : isbn.length()) + ")");
} else {
System.out.println("Success: ISBN " + isbn + " is valid.");
}
}
public static void main(String[] args) {
// Test Case 1: Invalid ISBN
try {
System.out.println("Testing Invalid ISBN:");
validateISBN("12345"); // 5 characters
} catch (InvalidISBNException e) {
System.out.println("Caught Exception: " + e.getMessage());
}
System.out.println("----------------------------------------");
// Test Case 2: Valid ISBN
try {
System.out.println("Testing Valid ISBN:");
validateISBN("9780134685991"); // 13 characters
} catch (InvalidISBNException e) {
System.out.println("Caught Exception: " + e.getMessage());
}
}
}
