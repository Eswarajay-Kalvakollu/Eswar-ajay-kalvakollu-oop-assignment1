// Superclass
class Book {
String title;
String author;
String isbn;
// Constructor
Book(String title, String author, String isbn) {
this.title = title;
this.author = author;
this.isbn = isbn;
}
// Method to display Book details
void display() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("ISBN: " + isbn);
}
}
// Subclass
class EBook extends Book {
double fileSizeMB;
// Constructor
EBook(String title, String author, String isbn, double fileSizeMB) {
super(title, author, isbn); // Call to Book's constructor
this.fileSizeMB = fileSizeMB;
}
// Overridden display method
@Override
void display() {
super.display(); // Call to Book's display
System.out.println("File Size: " + fileSizeMB + " MB");
}
}
// Main class
public class LibraryDemo {
public static void main(String[] args) {
EBook ebook = new EBook("Effective Java", "Joshua Bloch", "9780134685991", 5.2);
ebook.display();
}
}
