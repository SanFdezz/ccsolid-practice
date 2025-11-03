package cleancode;

import java.util.function.BiFunction;

public class Calculadora {

    public static float addition(float number1, float number2) {
        return number1 + number2;
    }

    public static float substract(float number1, float number2) {
        return number1 - number2;
    }

    public static float multiplication(float number1, float number2) {
        return number1 * number2;
    }

    public static float division(float number1, float number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return number1;
        }
    }


    // PREGUNTAR !!!
     public static double calculator(float number) {
        float result = number;

        result = addition(result,5);
        result = multiplication(result, 3);
        result = substract(result, 2);
        result = division(result, 4);

        result = addition(result, 10);
        result = multiplication(result, 2);

        BiFunction<Float, Float, Float> custom = (a, b) -> { return a + b * 2F; };
        result = custom.apply(result, 5f);

        result = multiplication(result, 3);
        result = division(result, 8);
        result = addition(result, 2);

        return result;
    }

}
