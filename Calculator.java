public interface Calculator{
    String calculate(String expression);
}

@Test
void test_calculator(){
    Calculator calc = ...;
    assert(calc.calculate("1 + 1").equals("2"));
}
