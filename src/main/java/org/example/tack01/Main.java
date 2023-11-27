package org.example.tack01;
import java.util.Arrays;
import java.util.List;
//**Напишите программу, которая использует Stream API для обработки списка чисел.
// Программа должна вывести на экран среднее значение всех четных чисел в списке.*//
public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14); //задаю массив

        double average = numbers.stream()
                .filter(n -> n % 2 == 0) // фильтрация только четных чисел
                .mapToInt(Integer::intValue) // преобразование в int
                .average() // вычисление среднего значения
                .orElse(0); // значение по умолчанию, если нет чисел

        System.out.println("Среднее значение четных чисел: " + average);
    }
}