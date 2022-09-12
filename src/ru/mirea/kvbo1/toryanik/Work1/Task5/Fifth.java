package ru.mirea.kvbo1.toryanik.Work1.Task5;
import java.util.Scanner;
public class Fifth
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Factorial task5 = new Factorial(input.nextInt());
        System.out.println(task5.calculateFactorial());

    }

}
