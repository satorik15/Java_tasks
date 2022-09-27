package ru.mirea.kvbo1.toryanik.Work8.Task3;
import java.util.Scanner;
public class AB
{
    public static String recursion(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        System.out.println(recursion(A, B)); // вызов рекурсивной функции
    }
}