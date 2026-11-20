package com.github.MariaTimshina;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Задание 1 ---");
        printThreeWords();

        System.out.println("\n--- Задание 2 ---");
        checkSumSign();

        System.out.println("\n--- Задание 3 ---");
        printColor();

        System.out.println("\n--- Задание 4 ---");
        compareNumbers();

        System.out.println("\n--- Задание 5 ---");
        System.out.println("Сумма 5 и 7 в пределах 10-20: " + isSumInRange(5, 7));
        System.out.println("Сумма 15 и 10 в пределах 10-20: " + isSumInRange(15, 10));

        System.out.println("\n--- Задание 6 ---");
        printNumberSign(0);
        printNumberSign(-5);
        printNumberSign(3);

        System.out.println("\n--- Задание 7 ---");
        System.out.println("Число -5 отрицательное? " + isNegative(-5));
        System.out.println("Число 0 отрицательное? " + isNegative(0));

        System.out.println("\n--- Задание 8 ---");
        printStringMultipleTimes("Привет", 3);

        System.out.println("\n--- Задание 9 ---");
        System.out.println("2024 високосный? " + isLeapYear(2024));
        System.out.println("1900 високосный? " + isLeapYear(1900));
        System.out.println("2000 високосный? " + isLeapYear(2000));

        System.out.println("\n--- Задание 10 ---");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        printArray(binaryArray);

        System.out.println("\n--- Задание 11 ---");
        int[] hundredArray = new int[100];
        fillArray(hundredArray);
        // Выводить весь массив в консоль не обязательно, но можно проверить первые/последние элементы
        System.out.println("Первый элемент: " + hundredArray[0] + ", Последний: " + hundredArray[99]);

        System.out.println("\n--- Задание 12 ---");
        int[] specificArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThan6(specificArray);
        printArray(specificArray);

        System.out.println("\n--- Задание 13 ---");
        createAndFillSquareMatrix(5);

        System.out.println("\n--- Задание 14 ---");
        int[] customArray = createArray(5, 8);
        printArray(customArray);
    }

    // 1. Метод печати трех слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Проверка суммы на положительность
    public static void checkSumSign() {
        int a = 10;
        int b = -15;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Вывод цвета в зависимости от значения
    public static void printColor() {
        int value = 101; // Можете изменить значение для проверки
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Сравнение двух чисел
    public static void compareNumbers() {
        int a = 5;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Проверка суммы в пределах от 10 до 20
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Печать положительное или отрицательное число
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    // 7. Возврат true, если число отрицательное
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Печать строки указанное количество раз
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9. Определение високосного года
    public static boolean isLeapYear(int year) {
        // Год високосный, если он делится на 4 без остатка,
        // но если он делится на 100, то он должен делиться и на 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10. Замена 0 на 1 и 1 на 0 в массиве
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    // 11. Заполнение массива числами от 1 до 100
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    // 12. Умножение чисел меньше 6 на 2
    public static void multiplyLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    // 13. Квадратный двумерный массив с единицами по диагонали
    public static void createAndFillSquareMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1; // Главная диагональ
        }

        // Красивый вывод матрицы в консоль (для проверки)
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 14. Создание массива заданной длины с заданным значением
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    // Вспомогательный метод для красивого вывода одномерного массива
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

} // Закрывающая скобка для всего класса Main