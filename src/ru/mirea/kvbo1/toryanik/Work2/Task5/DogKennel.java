package ru.mirea.kvbo1.toryanik.Work2.Task5;
import java.util.Scanner;
public class DogKennel {
    public static void main(String[] args)
    {
        Dog [] kennelmembers = new Dog[4];
        for(int i=0;i<4;i++)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя собаки: ");
            String name=in.nextLine();
            System.out.println("Введите возраст собаки: ");
            int age = in.nextInt();

            kennelmembers[i]=new Dog(name,age);
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(kennelmembers[i]);
        }

    }
}
