package test.java;

public class Fib {
    int first = 0;
    int second = 1;
    int next;
    private int[] fibonacciArray;

    public Fib(int number)
    {
        fibonacciArray = new int[10];
        for(int i = 0; i<number; i++)
        {
            if(i < 2)
            {
                fibonacciArray[i] = i;
            }
            else
            {
                next = first + second;
                fibonacciArray[i] = next;
                first = second;
                second = next;
            }
        }
    }

    public int[] getFibonacciArray()
    {
        return fibonacciArray;
    }
}
