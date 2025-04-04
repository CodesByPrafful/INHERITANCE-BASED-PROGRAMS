import java.util.*;
class CalVol extends BaseClass implements dataa
{
    double h;
    CalVol(double rad,double ht)
    {
        super(rad);
        h=ht;
    }
    public double volume()
    {
        return (3.14*(Math.pow(rad,2))*h);
    }
    void show()
    {
        super.show();
        System.out.print("Height:"+h
                  +"\n+"+"Volume:"+volume());
    }
}