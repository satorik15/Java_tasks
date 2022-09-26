package ru.mirea.kvbo1.toryanik.Work7.Task5;
import java.util.Scanner;
public class ProcessStrings implements WorkWithString
{

    public int Counter() {
        Scanner input = new Scanner(System.in);
        String stroka=input.nextLine();
        return stroka.length();
    }

    public String OddPosition() {
        Scanner input = new Scanner(System.in);
        String stroka=input.nextLine();
        char[] chArray = stroka.toCharArray();
        String newStroka="";
        for (int i=0;i<stroka.length();i = i + 2)
        {
            newStroka+=chArray[i];
        }
        return newStroka;
    }

    public String Inverted() {
        Scanner input = new Scanner(System.in);
        String stroka=input.nextLine();
        return new StringBuilder(stroka).reverse().toString();
    }
}
