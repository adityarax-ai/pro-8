public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Optional: main method for quick testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(5, 5));
        System.out.println("Subtract: " + calc.subtract(5, 5));
        System.out.println("Multiply: " + calc.multiply(5, 5));
        System.out.println("Divide: " + calc.divide(6, 5));
    }
}
