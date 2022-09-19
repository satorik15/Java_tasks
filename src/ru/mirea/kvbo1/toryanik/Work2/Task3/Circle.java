package ru.mirea.kvbo1.toryanik.Work2.Task3;

public class Circle extends Point
{
    private double radius;
    public Circle(double x, double y,double radius)
    {
        super(x, y);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double x,double y) {
        super.setX(x);
        super.setY(y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
