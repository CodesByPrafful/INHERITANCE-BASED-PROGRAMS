 /*
    A class FactorialSum has been defined to calculate the sum of factorials of numbers from 1 to n.   Class Specifications:

    Class Name: FactorialSum

    Data Members:
    - n      : integer to store the number entered by the user
    - sum    : integer to store the sum of factorials

    Methods/Member Functions:
    1. FactorialSum()    : A default constructor to initialize n and sum with appropriate values.
    2. void accept()     : Accepts an integer n from the user.
    3. int factorial(int x) : A method to calculate and return the factorial of x.
    4. void computeSum() : Calculates the sum of factorials from 1 to n and stores it in sum.
    5. void display()    : Displays the number n along with the sum of factorials.

    Define a class FactorialSum implementing the above specifications.
    Also, write a main() function to create an object of FactorialSum, invoke appropriate methods, 
    and display the result.

    Example:

    Input:
    Enter the number: 4

    Output:
    Number: 4
    Sum of the series: 33

    (Explanation: 1! + 2! + 3! + 4! = 1 + 2 + 6 + 24 = 33)
*/
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
