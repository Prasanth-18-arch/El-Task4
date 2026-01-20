public class ModularCalculator {

    // Addition (int)
    public int add(int a, int b) {
        return a + b;
    }

    // Addition (double) -> method overloading
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public int sub(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int mul(int a, int b) {
        return a * b;
    }

    // Division with exception handling
    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero not allowed");
        }
        return a / b;
    }

    // Pass-by-value demonstration
    public void passByValueDemo(int x) {
        x = 100; // does not affect original value
    }

    // Main method
    public static void main(String[] args) {
        ModularCalculator calc = new ModularCalculator();

        // Testing addition (int)
        System.out.println("Add (int): " + calc.add(10, 20));

        // Testing addition (double) -> overloading
        System.out.println("Add (double): " + calc.add(10.5, 20.5));

        // Testing subtraction
        System.out.println("Subtract: " + calc.sub(30, 10));

        // Testing multiplication
        System.out.println("Multiply: " + calc.mul(5, 4));

        // Testing division with exception handling
        try {
            System.out.println("Divide: " + calc.div(10, 2));
            System.out.println("Divide: " + calc.div(10, 0)); // will throw exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Testing pass-by-value
        int num = 50;
        calc.passByValueDemo(num);
        System.out.println("After pass-by-value: " + num); // still 50
    }
}

		
	