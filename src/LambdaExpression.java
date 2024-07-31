/**
 * This Java program demonstrates the use of lambda expressions
 * to implement a user-defined functional interface.
 *
 * A lambda expression is a concise way to represent an anonymous function (i.e., a function without a name).
 * Lambda expressions are used primarily to define the inline implementation of a functional interface.
 * A functional interface is an interface that contains only one abstract method.
 */


public class LambdaExpression {
    public static void main(String[] args) {
        // Lambda expression to implement the operation method of the Op interface
        // The lambda expression takes two parameters (x and y) and returns their product.
        Op multiply = (int x, int y) -> {
            return x * y;
        };

        // Using the implemented operation method through the lambda expression
        int res = multiply.operation(5, 6);
        // Printing the result of the operation (5 * 6)
        System.out.println(res);
    }
}

// Defining the Op interface
// This is a functional interface with a single abstract method
interface Op {
    // Abstract method that takes two integers and returns an integer
    int operation(int a, int b);
}
