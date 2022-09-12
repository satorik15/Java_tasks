package ru.mirea.kvbo1.toryanik.Work2.Task3;

public class Tester {

    public static void main(String[] args)
    {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(3,4,5);
        circles[1]=new Circle(4,5,6);
        circles[2]=new Circle(7,8,9);
        int NumberOfObjects=circles.length;
        System.out.println(circles.length);
        circles[0].setRadius(1,1);
        System.out.println(circles[0]);


    }
}
