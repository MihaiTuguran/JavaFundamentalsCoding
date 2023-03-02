package ro.sda.fundamentals._6_classes.part_2;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        SimpleCalculator anotherCalc = new SimpleCalculator();

        calc.setFirstNumber(100.73);
        calc.setSecondNumber(50.23);

        anotherCalc.setFirstNumber(56.70);
        anotherCalc.setSecondNumber(20.2);

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Addition result: " + calc.getAdditionResult());
        System.out.println("Subtraction result: " + calc.getSubtractionResult());
        System.out.println("Multiplication result: " + df.format(calc.getMultiplicationResult()));
        System.out.format("Division result: %.3f\n", calc.getDivisionResult());
        System.out.println("------------------------");
        System.out.println("Addition result: " + anotherCalc.getAdditionResult());
        System.out.println("Subtraction result: " + anotherCalc.getSubtractionResult());
        System.out.println("Multiplication result: " + anotherCalc.getMultiplicationResult());
        System.out.println("Division result: " + anotherCalc.getDivisionResult());
        System.out.println("------------------------");
        SimpleCalculator calc2 = new SimpleCalculator(34.58 , 12.98);
        System.out.println("Addition result: " + calc2.getAdditionResult());
        System.out.println("Subtraction result: " + calc2.getSubtractionResult());
    }
}
