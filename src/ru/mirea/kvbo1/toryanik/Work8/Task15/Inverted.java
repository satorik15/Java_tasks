package ru.mirea.kvbo1.toryanik.Work8.Task15;
import java.util.Scanner;
public class Inverted
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        inverted(x);
    }
    public static void inverted(int x)
    {
        if(x == 0)
            return;

        int y = x%10;

        x /= 10;

        System.out.println(y);;

        inverted(x);
    }
}
