package impl;

import exception.InvalidOperationException;
import exception.RangeException;
import util.ArabicToRoman;
import util.RomanToArabic;

public class RomanCalcImpl {

    public static String calculate(String[] values) {
        int a = RomanToArabic.romanToArabic(values[0]);
        int b = RomanToArabic.romanToArabic(values[2]);
        String operator = values[1];
        int answer;

        if (a > 10 && b > 10 || a < 1 && b < 1) {
            throw new RangeException("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
        }
        switch (operator) {
            case "+":
                answer = (a + b);
                break;
            case "-":
                answer = (a - b);
                break;
            case "*":
                answer = (a * b);
                break;
            case "/":
                answer = (a / b);
                break;
            default:
                throw new InvalidOperationException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
//        return String.valueOf(ArabicToRoman.arabicToRoman(answer));
        return ArabicToRoman.arabicToRoman(answer);
    }
}
