package lesson_1;

public class Main {
    public static void main(String[] args) {
        var varByte = 1; // 8 bit / -128..127
        var varShort = 1; // 16 bit / -32768..32767
        var varInt = 1; // 32 bit / -2147483648..2147483647 / число сначала приводиться к int
        var varLong = 1L; // 64 bit / -9223372036854775808..9223372036854775807

        var varFloat = 1.0f; // 32 bit /
        var varDouble = 1.0; // 64 bit / число сначала приводиться к double

        var varChar = 'a'; // 16 bit / only positive
        var varBoolean = false; // true or false / false по умолчанию

        System.out.println(Integer.MAX_VALUE);
        // Числа по умолчанию равны 0, для логических – false, для ссылок на объект – null
        System.out.println(drawIsMonitorsCounter(21, 10));
    }

    // Сигнатура метода — это имя метода плюс параметры (причем порядок параметров имеет значение).
    // В сигнатуру метода не входит возвращаемое значение, а также бросаемые им исключения.
    public static int drawIsMonitorsCounter(int monitors, int programmers) {
        if (monitors == programmers) {
            return 0;
        } else if (monitors > programmers) {
            return monitors % programmers;
        } else if (monitors < programmers) {
            return 0;
        } else {
            return 0;
        }
    }

    public static void priceCalculation(double price, int count) {

    }

}






// Как создать пакет через консоль
// Загуглив пакеты util java, не вижу Scanner, где он лежит
// где в IDE лежит util и как его найти

// где находятся методы оберток (в какой пакете) и чем статические константы оберток и где они обитают
// valueOf, parseInt, MAX_VALUE, MIN_VALUE

//Какие основыне источники решения задач на работе?
//Часто используются книги для решения задач или в основном гугл, документация, документация компании
