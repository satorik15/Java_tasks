package ru.mirea.kvbo1.toryanik.Work2.Task2;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball ball = new Ball(1,2);
        System.out.println(ball);
        ball.setXY(1, 4);
        System.out.println(ball);
        ball.move(3, -4);
        System.out.println(ball);
    }

}

