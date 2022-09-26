package ru.mirea.kvbo1.toryanik.Work7.Task4;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MathCalculable mc1= new MathFunc(-6,6);
        MathFunc mc2= new MathFunc(3,4);
        System.out.println("модуль числа:"+mc1.abs());
        System.out.println("число в степени:"+mc1.exponentiation());
        System.out.println("длина окружности"+mc2.lengthofcircle());
    }
}
