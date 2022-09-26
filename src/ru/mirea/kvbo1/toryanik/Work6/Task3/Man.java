package ru.mirea.kvbo1.toryanik.Work6.Task3;
public class Man implements Nameable
{
    public Man(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}
