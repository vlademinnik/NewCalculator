package impl;

import exception.InvalidOperationException;
import exception.RangeException;
import util.RomanToArabic;

import java.util.Scanner;

public class ArabCalcImpl {

    public static String calculate(String[] values) {

        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[2]);
        String operator = values[1];
        int answer;

        if (a>10 && b>10 || a<1 && b<1){
            throw new RangeException("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
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
        return String.valueOf(answer);
    }
}