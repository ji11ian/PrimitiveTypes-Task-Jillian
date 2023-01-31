public class PrimitiveTypes {
  public static void main(String[] args) {
    int myInt = 10;
    int myInt2 = 4;
    double myDouble = 2.5;
    char myChar = 'A';

    System.out.println(myInt / myDouble); // Output: 4.0
    System.out.println(myInt / myInt2); // Output: 2
    
    int myInt3 = (int) myDouble;
    System.out.println(myInt3); // Output: 2
    
    System.out.println(12 / 0); // Output: Exception in thread "main" java.lang.ArithmeticException: / by zero
    System.out.println(12.0 / 0); // Output: Infinity
    
    double myDouble2 = 4.6;
    double myDouble3 = 4.4;
    double myDouble4 = 4.5;

    myDouble2 += 0.5;
    System.out.println((int) myDouble2); // Output: 5
    
    myDouble3 += 0.5;
    System.out.println((int) myDouble3); // Output: 5
    
    myDouble4 += 0.5;
    System.out.println((int) myDouble4); // Output: 5
    
    System.out.println((int) myChar); // Output: 65
    System.out.println((char) myInt); // Output: '\n'
    
    int myInt3 = 7;
    System.out.println(myInt3); // Output: 7
    System.out.println(myInt3++); // Output: 7
    System.out.println(myInt3); // Output: 8
    System.out.println(++myInt3); // Output: 9
    
    System.out.println(145 % 10); // Output: 5
    System.out.println(178 % 10); // Output: 8
    System.out.println(10 % 2); // Output: 0
    System.out.println(11 % 2); // Output: 1
    System.out.println(12 % 2); // Output: 0
  }
}
