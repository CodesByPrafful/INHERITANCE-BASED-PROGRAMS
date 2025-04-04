import java.util.*;
class Circle extends Plane
{
    int x2,y2;
    double radius;
    double area;
    Circle(int nx1,int ny1,int x,int y)
    {
        super(nx1,ny1);
        x2=x;
        y2=y;
        radius=area=0.0D;
    }
    void findRadius()
    {
        radius=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }
    void findArea()
    {
        area=3.14*(Math.pow(radius,2));
    }
    void show()
    {
        super.show();
        System.out.print("Coordinate 2:"+"("+x2+","+y2+")"
                  +"\n"+ "Radius:"+radius
                  +"\n"+ "Area of Circle:"+area);
    }
}