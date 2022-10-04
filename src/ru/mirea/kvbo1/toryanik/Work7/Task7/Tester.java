package ru.mirea.kvbo1.toryanik.Work7.Task7;

public class Tester
{
    public static void main(String[] args)
    {
        Printable[] tester=new Printable[3];
        tester[0]=new Book();
        tester[1]=new Magazine("keke");
        tester[2]=new Book();
        int k=0;
        for (Printable i:tester)
        {
            tester[k].print();
            k++;
        }
        if   (tester[k] instanceof Magazine)
        {
            int l=0;
            Magazine.printMagazines(tester);
            k++;
        }
    }
}

