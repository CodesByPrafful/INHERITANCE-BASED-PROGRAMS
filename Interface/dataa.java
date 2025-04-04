/*
    A Java program is to be written using **interfaces** and **inheritance** to calculate the volume of a cylinder.

    **Interface Name: dataa**
    
    **Data Members:**
    - pi : A constant **double** initialized to **0.0** (incorrect value, should be **3.14** if used).
    
    **Methods:**
    - `public double volume();` → To be implemented by the derived class.

    **Class Name: BaseClass**
    
    **Data Members:**
    - rad : A **double** storing the radius of the base.

    **Methods:**
    1. `BaseClass(double r)`  
       - Constructor to initialize `rad`.
    2. `void show()`  
       - Displays the radius.

    **Class Name: CalVol (Derived Class, extends BaseClass & implements dataa)**

    **Data Members:**
    - h : A **double** storing the height.
    
    **Methods:**
    1. `CalVol(double rad, double ht)`  
       - Constructor to initialize `rad` (using `super`) and `h`.
    2. `public double volume()`  
       - Calculates the volume using the formula:
         \[
         Volume = 3.14 \times rad^2 \times h
         \]
    3. `void show()`  
       - Overrides `show()` to display the radius, height, and volume.

    **Task:**
    - Define the interface **dataa** with the method `volume()`.
    - Define the classes **BaseClass** and **CalVol** as per the above specifications.
    - Write a `main()` function to:
        - Accept values for radius and height.
        - Create an object of **CalVol**.
        - Compute the volume using `volume()`.
        - Display the details using `show()`.

    **Example:**

    **Input:**
    Enter the radius: 5  
    Enter the height: 10  

    **Output:**
    Radius: 5.0  
    Height: 10.0  
    Volume: 785.0  

    *(Explanation: Volume is calculated using:  
    \[
    3.14 \times 5^2 \times 10 = 3.14 \times 25 \times 10 = 785.0
    \])*
*/

interface dataa
{
    double pi=0.0D;
    public double volume();
}
