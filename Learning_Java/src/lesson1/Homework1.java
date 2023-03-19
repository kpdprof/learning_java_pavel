package lesson1;

public class Homework1 {
    public static void main(String[] args) {
        var varByte = 1; // 8 bit / -128..127
        var varShort = 1; // 16 bit / -32768..32767
        var varInt = 1; // 32 bit / -2147483648..2147483647 / число сначала приводиться к int
        var varLong = 1L; // 64 bit / -9223372036854775808..9223372036854775807

        var varFloat = 1.0f; // 32 bit /
        var varDouble = 1.0; // 64 bit / число сначала приводиться к double

        var varChar = 'a'; // 16 bit / only positive
        var varBoolean = false; // 8 bit/  true or false / false по умолчанию

        System.out.println(Integer.MAX_VALUE);
        // Числа по умолчанию равны 0, для логических – false, для ссылок на объект – null

        System.out.println(drawIsMonitorsCounter(9, 10));
        System.out.println(priceCalculation(8.50, 2));
    }

    // Сигнатура метода — это имя метода плюс параметры (причем порядок параметров имеет значение).
    // В сигнатуру метода не входит возвращаемое значение, а также бросаемые им исключения.
    public static int drawIsMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

    public static double priceCalculation(double price, int count) {
        return price * count;
    }
}

