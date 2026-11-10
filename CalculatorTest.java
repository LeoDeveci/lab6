public class CalculatorTest {
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(10, 5));
        System.out.println("Sum of two doubles: " + calc.add(10.5, 2.75));
        System.out.println("Concentrated strings: " + calc.add("hello ", "World"));
    }
}