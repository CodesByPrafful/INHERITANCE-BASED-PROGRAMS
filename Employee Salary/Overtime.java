import java.util.*;
class Overtime extends EmpSal
{
    int hours;
    double totsal;
    Overtime(String en,int ecd, double sal,int hrs, double totalsal)
    {
        super(en,ecd,sal);
        hours=hrs;
        totsal=totalsal;
    }
    void calsal()
    {
        if(hours>40)
        {
            salary+=5000;
        }
        else if(hours>30 && hours<=40)
        {
            salary+=3000;
        }
        else
        {
            salary+=0;
        }
        totsal+=salary;
    }
    void show()
    {
        super.show();
        System.out.println("Total Salary:"+totsal);
    }
}