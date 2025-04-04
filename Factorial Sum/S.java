import java.util.*;
class S extends Num
{
    int sum;
    S(int n)
    {
        super(n);
        sum=0;
    }
    void calsum()
    {
        for(int i=1;i<=n;i++)
        {
            sum=sum+factorial(i);
        }
    }
    void display()
    {
        super.display();
        System.out.println("Sum of the series:"+sum);
    }
}