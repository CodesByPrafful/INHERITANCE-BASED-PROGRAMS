/*
    A program is to be written in Java using **inheritance** to calculate the total amount of a product after tax and fine.

    Class Specifications:

    Class Name: Pduct (Base Class)

    Data Members:
    - name  : String to store the product name.
    - code  : Integer to store the product code.
    - amt   : Double to store the amount of the product.

    Methods:
    1. Pduct(String n, int c, double p) : Constructor to initialize name, code, and amount.
    2. void show()                      : Displays the product details.

    Class Name: Sale (Derived Class, extends Pduct)

    Data Members:
    - day    : Integer to store the number of days after purchase.
    - tax    : Double to store the tax amount.
    - totamt : Double to store the total amount after tax and fine.

    Methods:
    1. Sale(String nn, int code, double amount, int d) 
       - Constructor to initialize name, code, amount, and day.
       - Initializes tax and totamt to 0.
    2. void compute() 
       - Computes the tax as **12.4%** of the amount.
       - Computes a fine as **2.5%** of the amount if `day > 30`.
       - Calculates the total amount including tax and fine.
    3. void show() 
       - Overrides `show()` from the base class to display the product details along with the total amount.

    Task:
    - Define the classes **Pduct** and **Sale** as per the above specifications.
    - Write a `main()` function to:
        - Accept the product name, code, amount, and number of days after purchase.
        - Create an object of class Sale.
        - Compute the total amount using `compute()`.
        - Display the result using `show()`.

    Example:

    Input:
    Enter product name: Laptop
    Enter product code: 101
    Enter amount: 50000
    Enter number of days after purchase: 35

    Output:
    Name: Laptop
    Product Code: 101
    Amount: 50000.0
    Total Amount: 56620.0

    (Explanation: Tax = 12.4% of 50000 = 6200, Fine = 2.5% of 50000 = 1250
                  Total Amount = 50000 + 6200 + 1250 = 56620)
*/

import java.util.*;
class Pduct
{
    String name;
    int code;
    double amt;
    Pduct(String n,int c,double p)
    {
        name=n;
        code=c;
        amt=p;
    }
    void show()
    {
        System.out.print("Name:"+name
                     +"\n"+"Product Code:"+code
                     +"\n"+"Amount:"+amt);
    }
}
