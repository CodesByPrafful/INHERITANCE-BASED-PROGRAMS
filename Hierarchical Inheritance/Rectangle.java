import java.util.*;
class Rectangle implements Shape
{
    double length,breadth;
    Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    public double area()
    {
        return length*breadth;
    }
}