package ru.mirea.kvbo1.toryanik.Work1.Task5;

public class Factorial
{

    private int number; private int sum = 1;
    public int calculateFactorial() {
        for(int ind = 1; ind <= number; ind++) {
            sum *= ind;
        }
        return sum;
    }
    public Factorial(int number) {
        this.number = number;
    }
}
