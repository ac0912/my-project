import java.util.*;
class Employee
{
    private int id;
    private String name;
    protected double basic;
    void getEmp(int d,String nm,double b)
    {
        id=d;
        name=nm;
        basic=b;
    }
void showEmp()
{
    System.out.println("id "+id+"name "+name);
}
}
class Allowance extends Employee
{
    private double da,hra;
    protected double gross;
    void getAllowance()
    {
         da=(basic*20)/100;
         hra=(basic*20)/100;
         gross=basic+da+hra;
    }
void showAllowance()
{
    System.out.println("Da"+da+"hra"+hra);
}
}
class Deduction extends Allowance
{
    private double pf,tax,net;
    void getDeduction()
    {
        pf=(gross*5)/100;
        tax=(gross*2)/100;
        net=(gross-(tax+pf));
    }
    void showpayslip()
    {
        System.out.println("pf"+pf+"tax"+tax);
        System.out.println("basic"+basic+"gross salrary"+gross+"netsalary"+net);
    }
    }
    class Test 
    {
        public static void main(String args[])
        {
            Deduction dd=new Deduction();
             dd.getEmp(101, "Anwesha", 50000);
            dd.getAllowance();
            dd.getDeduction();
            dd.showEmp();
            dd.showAllowance();
            dd.showpayslip();
    }

}