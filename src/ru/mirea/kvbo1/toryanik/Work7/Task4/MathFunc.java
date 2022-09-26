package ru.mirea.kvbo1.toryanik.Work7.Task4;
import java.util.Scanner;
public class MathFunc implements MathCalculable
{
    private double x,r;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public MathFunc(double x, double r) {
        this.x = x;
        this.r = r;
    }

    public double abs()
    {
        if (getX()>=0)
        {
            return getX();
        }
        else
        {
            return -getX();
        }
    }


    public double exponentiation()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите степень, в которую необходимо возвести");
        int number = input.nextInt();
        double result=1;
        for (int i = 1; i <= number; i++) {
            result = result * getX();
        }
        return result;

    }
    public double lengthofcircle()
    {
        return 2*PI*getR();
    }
}
