package ru.mirea.kvbo1.toryanik.Work4.Task1;

public enum Seasons
{
    WINTER(-4), SPRING(10), SUMMER(24){
    @Override
    public String getDescription() {
        return "Теплое время года";
    }
}, AUTUMN(16);
    private double averageTemp;

    Seasons(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }
    public String getDescription()
    {
        return "Холодное время года";
    }
}
