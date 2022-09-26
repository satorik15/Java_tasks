package ru.mirea.kvbo1.toryanik.Work6.Task1;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft,bottomRight;
    MovableRectangle(int x1,int y1,int x2, int y2,int xSpeed,int ySpeed )
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    private boolean isEquSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }



    @Override
    public void moveUp()
    {
        if(isEquSpeed())
        {
            bottomRight.moveUp();
            topLeft.moveUp();
        }
    }

    @Override
    public void moveDown()
    {
        if(isEquSpeed())
        {
            bottomRight.moveDown();
            topLeft.moveDown();
        }
    }

    @Override
    public void moveLeft()
    {
        if(isEquSpeed())
        {
            bottomRight.moveLeft();
            topLeft.moveLeft();
        }
    }

    @Override
    public void moveRight()
    {
        if(isEquSpeed())
        {
            bottomRight.moveRight();
            topLeft.moveRight();
        }
    }
}
