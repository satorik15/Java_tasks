package ru.mirea.kvbo1.toryanik.Work8.Task2;

import java.util.Scanner;

public class Sequence
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        sequence(n);
    }

    public static void sequence(int n)
    {
        if(n>1)
        {
            sequence(n - 1);
            System.out.println(n);
        }
        if(n==1)
        {
            System.out.println("1");
        }
    }
}