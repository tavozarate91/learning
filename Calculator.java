public interface Calculator{
    String calculate(String expression);

public interface Calculator{
    String calculate(String expression, 
        HashMap<String, String> symbols);
}

@Test
void test_calculator(){
    Calculator calc = ...;
    assert(calc.calculate("1 + 1").equals("2"));
}
