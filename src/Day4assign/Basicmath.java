package Day4assign;

import java.lang.Math;

public class Basicmaths {

    public int add(int a, int b )
    {
        return a+b;
    }

    public  int substract (int a, int b)
    {
        return a-b;
    }

    

    public int fact(int num)
    {
        int factorial=1;

        for(int i=1;i<num;i++)
        {
            factorial=factorial+factorial*i;

        }
        return  factorial;

    }
}
