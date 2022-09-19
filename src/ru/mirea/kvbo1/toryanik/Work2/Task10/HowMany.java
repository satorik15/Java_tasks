package ru.mirea.kvbo1.toryanik.Work2.Task10;
import java.util.Scanner;
public class HowMany
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        int count = 0;
        if(input.length() != 0){
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        switch (count)
        {
            case 1:
                System.out.println("Вы ввели "+count+" слово");
                break;
            case 2 | 3 | 4:
                System.out.println("Вы ввели "+count+" слова");
                break;
            default:
                System.out.println("Вы ввели "+count+" слов");
        }
    }
}
