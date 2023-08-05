package org.example;

public class HomeWork1 {
//Напишите функцию, которая
// принимает массив чисел и возвращает наибольшее число из этого массива.
    public static int findMaxNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int maxNum = arr[0]; // Предполагаем, что первый элемент - наибольший

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i]; // Обновляем значение наибольшего числа
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 15, 1};
        int result = findMaxNumber(numbers);
        System.out.println("Наибольшее число в массиве: " + result); // Выведет: Наибольшее число в массиве: 15
    }

//Напишите функцию, которая принимает строку и возвращает true,
// если строка является палиндромом (читается одинаково слева направо и справа налево)
// и false в противном случае.

    public static class PalindromeChecker {

        // Метод isPalindrome принимает строку и проверяет, является ли она палиндромом.
        public static boolean isPalindrome(String str) {
            if (str == null) {
                return false;
            }
            String lowerCase = str.toLowerCase();
            return lowerCase.equals(new StringBuilder(lowerCase).reverse().toString());
        }
        public static void main(String[] args) {
            String str1 = "level";
            String str2 = "hello";

            System.out.println(str1 + " является палиндромом: " + isPalindrome(str1));
            System.out.println(str2 + " является палиндромом: " + isPalindrome(str2));
        }
    }
}
