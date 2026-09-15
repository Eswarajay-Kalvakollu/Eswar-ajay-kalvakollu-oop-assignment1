// Interface
interface Payable {
double calculatePay(); // Abstract method
}
// Concrete class implementing Payable
class Freelancer implements Payable {
String name;
double hourlyRate;
int hoursWorked;
// Constructor
Freelancer(String name, double hourlyRate, int hoursWorked) {
this.name = name;
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}
// Implementing the calculatePay method
@Override
public double calculatePay() {
return hourlyRate * hoursWorked;
}
// Method to display pay details
void displayDetails() {
System.out.println("Freelancer Name: " + name);
System.out.println("Hourly Rate: $" + hourlyRate);
System.out.println("Hours Worked: " + hoursWorked);
System.out.println("Total Pay: $" + calculatePay());
}
}
// Main class
public class InterfaceDemo {
public static void main(String[] args) {
Freelancer freelancer = new Freelancer("John Doe", 45.50, 40);
freelancer.displayDetails();
}
}
