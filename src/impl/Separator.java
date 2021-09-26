package impl;

import exception.DifferentSystemsException;
import exception.InvalidFormatException;
import exception.InvalidOperationException;

public class Separator {
    public static boolean separator(String[] values) {
        if (values.length < 3) {
            throw new InvalidFormatException("строка не является математической операцией");
        }
        if (values.length > 3) {
            throw new InvalidOperationException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (values[0].matches("\\d*") && values[2].matches("\\d*")) {
            return false;
        } else if (values[0].matches("XI|X|V|IV|VI|VII|VIII|IX|I*") && values[2].matches("XI|X|V|IV|VI|VII|VIII|IX|I*")) {
            return true;
        } else {
            throw new DifferentSystemsException("неверный ввод данных");
        }
    }
}