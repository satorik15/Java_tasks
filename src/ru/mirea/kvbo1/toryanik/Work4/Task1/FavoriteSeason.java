package ru.mirea.kvbo1.toryanik.Work4.Task1;

public class FavoriteSeason {
    public static void main(String[] args) {
        Seasons season = Seasons.WINTER;
        System.out.println(season+" "+season.getDescription());
        print(Seasons.WINTER);
        print_all();
    }


    public static void  print(Seasons season)
    {
        switch (season)
        {
            case WINTER:
                System.out.println("I like Winter");
                break;
            case AUTUMN:
                System.out.println("I like Autumn");
                break;
            case SPRING:
                System.out.println("I like Spring");
                break;
            case SUMMER:
                System.out.println("I like Summer");
                break;
        }
    }
    public static void print_all()
    {
        for(Seasons s : Seasons.values())
        {
            System.out.println(s+" "+s.getAverageTemp()+" " +s.getDescription());
        }
    }



}
