/*
   Write a program in Java to calculate the **area of a circle and a rectangle** using **interfaces**.

   **Interface: Shape**
   - Contains a method: `public double area();`

   **Class: Circ (implements Shape)**
   - Data Members:
     - `radius` (double) → Stores the radius of the circle.
   - Methods:
     - `Circ(int r)` → Constructor to initialize `radius`.
     - `public double area()` → Computes the area using the formula: `3.14 * radius * radius`.

   **Class: Rectangle (implements Shape)**
   - Data Members:
     - `length` (double) → Stores the length of the rectangle.
     - `breadth` (double) → Stores the breadth of the rectangle.
   - Methods:
     - `Rectangle(double l, double b)` → Constructor to initialize `length` and `breadth`.
     - `public double area()` → Computes the area using the formula: `length * breadth`.

   **Task:**
   - Accept values for **radius, length, and breadth**.
   - Create objects for **Circ** and **Rectangle**.
   - Compute and display their areas.

   **Example:**

   **Input:**
*/
interface Shape
{
    double area();
}
