import java.util.*;
class Num
{
    int n;
    Num(int nn)
    {
        n=nn;
    }
    int factorial(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
    void display()
    {
        System.out.println("Number:"+n);
    }
}