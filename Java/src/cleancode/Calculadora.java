package cleancode;

import java.util.function.BiFunction;

public class Calculadora {
    public static float operation(float number1, float number2, Operation operation) {
        switch (operation) {
            case Operation.ADDITION:
                return number1 + number2;
            case Operation.SUBTRACTION:
                return number1 - number2;
            case Operation.MULTIPLICATION:
                return number1 * number2;
            case Operation.DIVISION:
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return number1;
                }
        }
        return number1;
    }

    public static double calculator(float number) {
        float result = number;

        result = operation(result, 5, Operation.ADDITION);
        result = operation(result, 3, Operation.MULTIPLICATION);
        result = operation(result, 2, Operation.SUBTRACTION);
        result = operation(result, 4, Operation.DIVISION);

        result = operation(result, 10, Operation.ADDITION);
        result = operation(result, 2, Operation.MULTIPLICATION);

        BiFunction<Float, Float, Float> custom = (a, b) -> { return a + b * 2F; };
        result = custom.apply(result, 5f);

        result = operation(result, 3, Operation.MULTIPLICATION);
        result = operation(result, 8, Operation.DIVISION);
        result = operation(result, 2, Operation.ADDITION);

        return result;
    }
}
