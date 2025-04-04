import java.util.*;
class Circ implements Shape 
{
    double radius;
    Circ(int r)
    {
        radius=r;
    }
    public double area()
    {
        return (3.14*radius*radius);
    }
}