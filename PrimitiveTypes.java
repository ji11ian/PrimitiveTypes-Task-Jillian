public class PrimitiveTypes {
    public static void main(String[] args) {
        int myInt = 10;
        int myInt2 = 4;
        double myDouble = 2.5;
        char myChar = 'A';
        System.out.println(myInt / myDouble); // 4.0
        System.out.println(myInt / myInt2); // 2
        
        // 5. The result is 4.0 because the expression myInt divided by myDouble is calculated as an int divided by a double, 
        // so it returns a double result.
        // 6. The result is 2 because the expression myInt divided by myInt2 is calculated as an int divided by an int,
        // so it returns an int result.

        int myInt3 = (int) myDouble;
        System.out.println(myInt3); // 2
        
        // 7. I learned that int and double variables can produce different results when divided, 
        // depending on the type of the variables used in the expression.
        // 8. This is an example of explicit casting.
        // 9. The result is 2.

        System.out.println(12/0); // Error: Division by zero
        System.out.println(12.0/0); // Infinity
        
        double myDouble2 = 4.6;
        double myDouble3 = 4.4;
        double myDouble4 = 4.5;
        myDouble2 += 0.5;
        System.out.println((int) myDouble2); // 5
        myDouble3 += 0.5;
        System.out.println((int) myDouble3); // 4
        myDouble4 += 0.5;
        System.out.println((int) myDouble4); // 5
        
        // 10. I learned that when a double value is cast to an int, it is truncated (not rounded) 
        // to the nearest integer value.
        // 11. When adding 0.5 to a double and then casting it to an int, the result can be either 4 or 5, 
        // depending on the value of the original double.

        System.out.println((int) myChar); // 65
        System.out.println((char) myInt); // '\n'
        
        int myInt3 = 7;
        System.out.println(myInt3); // 7
        System.out.println(myInt3++); // 7
        System.out.println(myInt3); // 8
        System.out.println(++myInt); // 11
        
        // 12. I learned that the increment operator (++) can be used in two ways: 
        // post-increment (myInt3++) and pre-increment (++myInt).
        // The difference between the two is that post-increment returns the original value before the increment, 
        // while pre-increment increments the value first and then returns the incremented value.

        System.out.println(145 % 10); // 5
        System.out.println(178 % 10); // 8
        
        // 13. I learned that the modulo operator (%) returns the remainder of the division of two numbers.

        System.out.println(10 % 2); // 0
        System.out.println(11 % 2); // 1
        System.out.println(12 % 2); // Output: 0
  }
}
