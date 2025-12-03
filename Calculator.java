//Interface Gustavo
public interface Calculator{
    String calculate(String expression);
    int sum (a, b);
}

//Implementation by Camilo
public Class Calculator{
    public int result;
    public int x;
    public int y;

    public Calculator(int var_x, int var_y){
	    this.x = var_x;
	    this.y = var_y;
    }

    public int sum(){
	    return this.result = this.x + this.y; 
    }
}

//Testing by Gustavo
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 7);
        int sum = calc.sum();
        System.out.println("Sum: " + sum);          // Expected: 12
        System.out.println("Result field: " + calc.result); // Expected: 12
        //ok

        Calculator calc = new Calculator(0, -1);
        int sum = calc.sum();
        System.out.println("Sum: " + sum);          // Expected: -1
        System.out.println("Result field: " + calc.result); // Expected: -1
        //ok

        Calculator calc = new Calculator(0, 0);
        int sum = calc.sum();
        System.out.println("Sum: " + sum);          // Expected: 0
        System.out.println("Result field: " + calc.result); // Expected: 0
        //ok

        Calculator calc = new Calculator(0, -5);
        int sum = calc.sum();
        System.out.println("Sum: " + sum);          // Expected: -5
        System.out.println("Result field: " + calc.result); // Expected: -5
        //ok
    }
}
