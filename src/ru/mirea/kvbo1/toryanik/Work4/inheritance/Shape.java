package ru.mirea.kvbo1.toryanik.Work4.inheritance;

import ru.mirea.kvbo1.toryanik.Work2.Task3.Point;

public abstract class Shape
{
    protected String  colour;
    protected boolean filled;

    public Shape()
    {
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled)
    {
    this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimetr();
    public abstract String toString();



}
