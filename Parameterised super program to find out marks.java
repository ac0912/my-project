import java.util.*;
class Student
{
    protected int addition;
    Student(int s3)
    {
        if(s3>40)
        addition=s3-40;
    }
}
class Subject extends Student
{
    private int roll,sub1,sub2,total;
    private String name;
    Subject (int r1,String nm,int s1,int s2,int s3)
    {
        super(s3);
        roll=r1;
        name=nm;
        sub1=s1;
        sub2=s2;
        }
  void showresult()
  {
      total=sub1+sub2+addition;
      System.out.println("Roll"+roll);
      System.out.println("Name"+name);
      System.out.println("Total marks"+total);
  }
}
  class Operation
  {
    public static void main(String args[])
    {
        Subject sb=new Subject(1011,"AMIT",70,80,85);
        sb.showresult();
    }
  }