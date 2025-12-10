public class Problem1 {

    static class Calculator {

        public double calculate(double a, double b, String operation) {

            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    return a + b;

                case "sub":
                case "-":
                    return a - b;

                case "mul":
                case "*":
                    return a * b;

                case "div":
                case "/":
                    if (b == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    return a / b;

                default:
                    throw new IllegalArgumentException("Invalid operation");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double result = calc.calculate(10, 5, "add");
        System.out.println("Result = " + result);
    }
}
