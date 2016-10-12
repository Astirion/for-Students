package ru.testproject.tasks;

public class Loop7_EasyNumbers {
// of corse i was forced to steal but i done this task!!!
    public static void main(String[] args)
    {
        int a, b;
        for(a = 1; a < 101; a++)
        {
            b = 0;
            for(int i = 1; i <= a; i++)
            {
                if(a % i == 0)
                {
                   b++;
                }
            }
            if(b <= 2) {
                System.out.print(a + " ");
            }
        }

    }
}


