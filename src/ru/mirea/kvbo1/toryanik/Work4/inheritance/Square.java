package ru.mirea.kvbo1.toryanik.Work4.inheritance;

public class Square extends Rectangle
{
    public Square()
    {

    }
    double side=getLength();
    public Square(double side)
    {
        this.side=side;
    }
    public Square(double side, String colour, boolean filled)
    {
        this.side=side;
        super.getColour();
        super.isFilled();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
