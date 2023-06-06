import java.util.Scanner;
class Student 
{
    private int sno;
    private String sname;
    private String saddress;
    public void setSno(int n)
    {
        sno=n;
    }
     public void setSname(String name)
     {
         sname=name;
     }
      public void setSaddress(String addr)
      {
          saddress=addr;
      }
      public int getSno()
      {
          return sno;
      }
      public String getSname()
      {
           return sname;
      }
      public String getSaddress()
      {
          return saddress;
      }
    public void display()
    {
     System.out.println("name="+sname+" rno="+sno+" address="+saddress);   
    }
}
public class StudentDemo
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("enter rno:");
        int sno=sc.nextInt();
        System.out.println("enter name:");
        String sname=sc.next();
        System.out.println("enter address:");
        String saddress=sc.next();
        s.setSno(sno);
        s.setSname(sname);
        s.setSaddress(saddress);
        System.out.println("Student details are:");
        s.display();
    }
}