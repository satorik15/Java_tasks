package ru.mirea.kvbo1.toryanik.Work8.Task5;
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n)
    {
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            return n % 10 + sum(n / 10);
        }
    }
}
