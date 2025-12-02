//Interface Gustavo
public interface Calculator{
    String calculate(String expression);
    int sum (a, b);
}

//Implementation by Camilo
//Dont forget to update the amount of hours


//Testing by Gustavo
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 7);
        int sum = calc.sum();
        System.out.println("Sum: " + sum);          // Expected: 12
        System.out.println("Result field: " + calc.result); // Expected: 12

        Calculator calc = new Calculator(0, -1);
        int sum = calc.sum();
        System.out.println("Sum: " + sum);          // Expected: -1
        System.out.println("Result field: " + calc.result); // Expected: -1
    }
}
