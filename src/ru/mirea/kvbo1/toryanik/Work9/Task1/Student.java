package ru.mirea.kvbo1.toryanik.Work9.Task1;

import java.util.Arrays;

public class Student
{
    private int iDNumber[];

    public Student()
    {
        iDNumber=new int[5];
        iDNumber[0]=24;
        iDNumber[1]=1;
        iDNumber[2]=14;
        iDNumber[3]=46;
        iDNumber[4]=23;
    }
    public void SelectionSort()
    {
        for (int i = 0; i < iDNumber.length; i++)
        {
            // Вытаскиваем значение элемента
            int value = iDNumber[i];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int j = i - 1;
            for (; j >= 0; j--)
            {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < iDNumber[j])
                {
                    iDNumber[j + 1] = iDNumber[j];
                } else
                {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            iDNumber[j + 1] = value;
        }
    }
    public void PrintScr() {
        for (int i=0;i<iDNumber.length;i++) {
            System.out.println(iDNumber[i]);
        }
    }

}
