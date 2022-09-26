package ru.mirea.kvbo1.toryanik.Work6.Task1;

public class Tester
{
    public static void main(String[] args)
    {
        Movable point = new MovablePoint(0, 0, 1, 4);
        System.out.println("Point:\n");
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println("Up+Right -> " + point);

        System.out.println("\nCircle:\n");
        point = new MovableCircle(0, 0, 2, 4, 6);
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println("Down+Left -> " + point);
        System.out.println("\nRectangle:\n");

        point = new MovableRectangle(0, 0, 4, 4, 2,4);
        System.out.println(point);
        point.moveRight();
        point.moveDown();
        System.out.println("Right+Down -> " + point);
    }
}
