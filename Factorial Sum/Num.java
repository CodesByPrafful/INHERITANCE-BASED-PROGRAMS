/*
    A program is to be written in Java using **inheritance** to compute the sum of factorials from 1 to n.

    Class Specifications:

    Class Name: Num (Base Class)

    Data Members:
    - n   : integer to store the number

    Methods:
    1. Num(int nn)     : Constructor to initialize n.
    2. int factorial(int a) : A method to compute and return the factorial of a number.
    3. void display()  : Displays the number.

    Class Name: S (Derived Class, extends Num)

    Data Members:
    - sum : integer to store the sum of factorials

    Methods:
    1. S(int n)        : Constructor to initialize n and sum.
    2. void calsum()   : Calculates the sum of factorials from 1 to n and stores it in sum.
    3. void display()  : Overrides the display() method of the base class to display the sum of factorials.

    Task:
    - Define the classes **Num** and **S** as per the above specifications.
    - Write a `main()` function to:
        - Accept an integer n from the user.
        - Create an object of class S.
        - Compute the sum of factorials using `calsum()`.
        - Display the result using `display()`.

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
