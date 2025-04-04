/*
    A program is to be written in Java using **inheritance** to calculate the total salary of an employee after considering overtime work.

    Class Specifications:

    **Class Name: EmpSal (Base Class)**

    **Data Members:**
    - empname  : String to store the employee's name.
    - empcode  : Integer to store the employee's code.
    - salary   : Double to store the basic salary.

    **Methods:**
    1. EmpSal(String ename, int ecode, double sal) 
       - Constructor to initialize empname, empcode, and salary.
    2. void show() 
       - Displays the employee details.

    **Class Name: Overtime (Derived Class, extends EmpSal)**

    **Data Members:**
    - hours   : Integer to store the number of overtime hours.
    - totsal  : Double to store the total salary after overtime.

    **Methods:**
    1. Overtime(String en, int ecd, double sal, int hrs, double totalsal) 
       - Constructor to initialize empname, empcode, salary, hours, and totsal.
    2. void calsal() 
       - Computes the total salary based on overtime hours:
         - If hours > 40, an additional ₹5000 is added to the salary.
         - If hours > 30 and ≤ 40, an additional ₹3000 is added to the salary.
         - Otherwise, no extra amount is added.
       - Updates totsal accordingly.
    3. void show() 
       - Overrides `show()` from the base class to display the employee details along with the total salary.

    **Task:**
    - Define the classes **EmpSal** and **Overtime** as per the above specifications.
    - Write a `main()` function to:
        - Accept the employee's name, code, salary, and overtime hours.
        - Create an object of class **Overtime**.
        - Compute the total salary using `calsal()`.
        - Display the details using `show()`.

    **Example:**

    **Input:**
    Enter employee name: John Doe  
    Enter employee code: 123  
    Enter basic salary: 40000  
    Enter overtime hours: 42  

    **Output:**
    Name: John Doe  
    Employee Code: 123  
    Salary: 40000.0  
    Total Salary: 45000.0  

    *(Explanation: Since overtime hours > 40, an additional ₹5000 is added, so total salary = 40000 + 5000 = 45000)*
*/

import java.util.*;
class EmpSal
{
    String empname;
    int empcode;
    double salary;
    EmpSal(String ename, int ecode , double sal)
    {
        empname=ename;
        empcode=ecode;
        salary=sal;
    }
    void show()
    {
        System.out.println("Name:"+empname
                        +"\n"+"Employee Code:"+empcode
                        +"\n"+"Salary:"+salary);
    }
}
