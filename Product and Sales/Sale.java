import java.util.*;
class Sale extends Pduct
{
    int day;
    double tax;
    double totamt;
    Sale(String nn,int code,double amount,int d)
    {
        super(nn,code,amount);
        day=d;
        tax=0;
        totamt=0;
    }
    void compute()
    {
        tax=(12.4/100)*amt;
        double fine=(2.5/100)*amt;
        if(day>30)
        {
            totamt=amt+tax+fine;
        }
        else
        {
            totamt=amt+tax;
        }
    }
    void show()
    {
        super.show();
        System.out.println("Total Amount:"+totamt);
    }
}