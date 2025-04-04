import java.util.*;
class EmpSal
{
    String empname;
    int empcode;
    double salary;
    EmpSal(String ename, int ecode , double sal)
    {
        empname=ename;
        empcode=ecode;
        salary=sal;
    }
    void show()
    {
        System.out.println("Name:"+empname
                        +"\n"+"Employee Code:"+empcode
                        +"\n"+"Salary:"+salary);
    }
}