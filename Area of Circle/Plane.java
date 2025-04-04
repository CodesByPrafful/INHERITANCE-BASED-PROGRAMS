/*
    A program is to be written in Java using **inheritance** to calculate the radius and area of a circle using two coordinate points.

    **Class Specifications:**

    **Class Name: Plane (Base Class)**

    **Data Members:**
    - x1 : Integer to store the x-coordinate of the first point.
    - y1 : Integer to store the y-coordinate of the first point.

    **Methods:**
    1. Plane(int nx, int ny)  
       - Constructor to initialize x1 and y1.
    2. void show()  
       - Displays the coordinates of the first point.

    **Class Name: Circle (Derived Class, extends Plane)**

    **Data Members:**
    - x2      : Integer to store the x-coordinate of the second point.
    - y2      : Integer to store the y-coordinate of the second point.
    - radius  : Double to store the radius of the circle.
    - area    : Double to store the area of the circle.

    **Methods:**
    1. Circle(int nx1, int ny1, int x, int y)  
       - Constructor to initialize x1, y1, x2, and y2.
       - Initializes radius and area to 0.0.
    2. void findRadius()  
       - Calculates the radius using the **distance formula**:
         \[
         radius = \sqrt{(x2 - x1)^2 + (y2 - y1)^2}
         \]
    3. void findArea()  
       - Calculates the area of the circle using the formula:
         \[
         area = 3.14 \times radius^2
         \]
    4. void show()  
       - Overrides `show()` from the base class to display:
         - Both coordinate points.
         - The radius of the circle.
         - The area of the circle.

    **Task:**
    - Define the classes **Plane** and **Circle** as per the above specifications.
    - Write a `main()` function to:
        - Accept the coordinates of two points.
        - Create an object of class **Circle**.
        - Compute the **radius** using `findRadius()`.
        - Compute the **area** using `findArea()`.
        - Display the details using `show()`.

    **Example:**

    **Input:**
    Enter x1: 3  
    Enter y1: 4  
    Enter x2: 6  
    Enter y2: 8  

    **Output:**
    Coordinate 1: (3,4)  
    Coordinate 2: (6,8)  
    Radius: 5.0  
    Area of Circle: 78.5  

    *(Explanation: The radius is calculated using the distance formula:  
    \[
    radius = \sqrt{(6-3)^2 + (8-4)^2} = \sqrt{9 + 16} = \sqrt{25} = 5
    \]
    The area is then calculated using \( 3.14 \times 5^2 = 78.5 \))*
*/

import java.util.*;
class Plane
{
    int x1,y1;
    Plane(int nx,int ny)
    {
        x1=nx;
        y1=ny;
    }
    void show()
    {
        System.out.println("Coordinate 1:"+"("+x1+","+y1+")");
    }
}
