/**
 * This Java program demonstrates the use of an anonymous class to implement a user-defined interface.
 *
 * An anonymous class is a class that does not have a name and is declared and instantiated all at once.
 * It is typically used to override methods of an interface or an abstract class without creating a named subclass.
 * In this example, we use an anonymous class to implement the 'Age' interface.
 */

public class AnonymousClass {

    public static void main(String[] args) {

        // Creating an anonymous class that implements the Age interface
        Age obj = new Age() {
            // Overriding the getAge method from the Age interface
            @Override
            public void getAge() {
                // Printing the value of the age variable from the Age interface
                System.out.println("Age is " + age);
            }
        };

        // Calling the getAge method on the anonymous class instance
        obj.getAge();
    }
}

// Defining the Age interface
interface Age {
    // Declaring an integer variable 'age' with a value of 21
    int age = 21;

    // Declaring an abstract method getAge()
    void getAge();
}
