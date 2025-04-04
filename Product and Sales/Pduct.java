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