package lesson1;

import java.util.Arrays;

import static lesson1.HW1.arr;
import static lesson1.HW4.getStringFromArray;

public class HW_cycles {
    public static void main(String[] args) {
        HW1.printOddNumbers(arr);
        getStringFromArray(arr);

    }
}

class HW1 {
    public static int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void printOddNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i]);
                System.out.print(", ");
            }
        }
        System.out.println("\b\b");
    }
//    Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него,
//    через запятую. Конец вывода должен перевести курсор на новую строку.
}

class HW2 {
    int[] firstArray = {1, 3, 7, 5};
    int[] secondArray = {8, 4, 2, 4};
    static int count = 0;

    public static String merge(int[] firstArray, int[] secondArray) {
        int[] generalАrray = new int[firstArray.length + secondArray.length];
        for(int i = 0; i < firstArray.length; i++) {
            generalАrray[i] = firstArray[i];
            count++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            generalАrray[count++] = secondArray.length;
        }
        return generalАrray.toString();
    }
    // метод chainy
//    public static int sort() {
//
//    }

    public static int mergeAndSort(int[] firstArray, int[] secondArray) {
//        merge

//        sort

        return 0;
    }
//    Реализовать метод mergeAndSort(int[] firstArray, int[] secondArray), который принимает соединяет и сортирует два
//    произвольных массива чисел
//
//    Пример ввода: {1, 3, 7, 5}, {8, 4, 2, 4}
//    Пример вывода: [1, 2, 3, 4, 4, 5, 7, 8]
//
//    Пример ввода: {} {1, 4, 3}
//    Пример вывода: [1, 3, 4]
}

class HW3 {

//    Дан массив произвольной длины. Необходимо вернуть центральную часть массива, при чем, если массив четной длины,
//    то вернуть массив из двух элементов, если нечетной, то вернуть массив из одного элемента.
//
//    Пример ввода: {1, 5, 2, 17}
//    Пример вывода: [5, 2]
//
//    Пример ввода: {14, 16, 3}
//    Пример вывода: [16]
}

class HW4 {
    public static void getStringFromArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b]");
        
        // методы классы Arrays посмотреть

    }

//    Реализуйте метод, который будет принимать массив чисел, и выводить его значения в консоль c помощью методов
//    класса Arrays
//
//    Пример ввода: {1,2,3,4,5,5,6,7,7}
//    Пример вывода: [1, 2, 3, 4, 5, 5, 6, 7, 7]
}

