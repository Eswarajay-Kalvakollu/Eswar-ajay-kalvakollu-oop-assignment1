# Eswar-ajay-kalvakollu-oop-assignment1
**Problem A: Library Scenario (Inheritance & Constructor Chaining)**
**Objective**
Demonstrate inheritance and constructor chaining by defining a Book superclass and an EBook subclass, overriding the display() method to print both parent and child attributes.
**Key Concepts**
* Inheritance: extends
* Constructor Chaining: super()
* Method Overriding: @Override
**Code Structure**
// Superclass
class Book {
String title;
String author;
String isbn;
Book(String title, String author, String isbn) {
this.title = title;
this.author = author;
this.isbn = isbn;
}
void display() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("ISBN: " + isbn);
}
}
// Subclass
class EBook extends Book {
double fileSizeMB;
EBook(String title, String author, String isbn, double fileSizeMB) {
super(title, author, isbn);
this.fileSizeMB = fileSizeMB;
}
@Override
void display() {
super.display();
System.out.println("File Size: " + fileSizeMB + " MB");
}
}
// Main Class
public class LibraryDemo {
public static void main(String[] args) {
EBook ebook = new EBook("Effective Java", "Joshua Bloch", "9780134685991", 5.2);
ebook.display();
}
}
**Sample Output**
Title: Effective Java
Author: Joshua Bloch
ISBN: 9780134685991
File Size: 5.2 MB

**Problem B: Payable Interface (Abstraction & Interfaces)**
**Objective**
Illustrate interface implementation by declaring a Payable interface and implementing its abstract method calculatePay() within a Freelancer class.
**Key Concepts**
* Interface Declaration: interface
* Interface Implementation: implements
* Concepts: Abstraction & Encapsulation
**Code Structure**
// Interface
interface Payable {
double calculatePay();
}
// Concrete Class
class Freelancer implements Payable {
String name;
double hourlyRate;
int hoursWorked;
Freelancer(String name, double hourlyRate, int hoursWorked) {
this.name = name;
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}
@Override
public double calculatePay() {
return hourlyRate * hoursWorked;
}
void displayDetails() {
System.out.println("Freelancer Name: " + name);
System.out.println("Hourly Rate: $" + hourlyRate);
System.out.println("Hours Worked: " + hoursWorked);
System.out.println("Total Pay: $" + calculatePay());
}
}
// Main Class
public class InterfaceDemo {
public static void main(String[] args) {
Freelancer freelancer = new Freelancer("John Doe", 45.50, 40);
freelancer.displayDetails();
}
}
**Sample Output**
Freelancer Name: John Doe
Hourly Rate: $45.5
Hours Worked: 40
Total Pay: $1820.0

**Problem C: Custom Exception (InvalidISBNException)**
**Objective**
Demonstrate custom exception handling by creating an InvalidISBNException class that is thrown whenever an ISBN string's length is not exactly 13 characters.
**Key Concepts**
* Custom Exceptions: extends Exception
* Explicit Throwing: throw new
* Exception Handling: try-catch
**Code Structure**
// Custom Exception
class InvalidISBNException extends Exception {
public InvalidISBNException(String message) {
super(message);
}
}
// Main Class
public class ExceptionDemo {
static void validateISBN(String isbn) throws InvalidISBNException {
if (isbn == null || isbn.length() != 13) {
throw new InvalidISBNException("Invalid ISBN: Length must be exactly 13 characters. (Given length: " + (isbn == null ? 0 : isbn.length()) + ")");
} else {
System.out.println("Success: ISBN " + isbn + " is valid.");
}
}
public static void main(String[] args) {
// Test Case 1: Invalid ISBN
try {
System.out.println("Testing Invalid ISBN:");
validateISBN("12345");
} catch (InvalidISBNException e) {
System.out.println("Caught Exception: " + e.getMessage());
}
System.out.println("--------------------------------------------------");
// Test Case 2: Valid ISBN
try {
System.out.println("Testing Valid ISBN:");
validateISBN("9780134685991");
} catch (InvalidISBNException e) {
System.out.println("Caught Exception: " + e.getMessage());
}
}
}
**Sample Output**
Testing Invalid ISBN:
Caught Exception: Invalid ISBN: Length must be exactly 13 characters. (Given length: 5)
Testing Valid ISBN:
Success: ISBN 9780134685991 is valid.
