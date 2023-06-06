class Demo
{
    public void sum()
    {
        System.out.println("No args are passed");
    }
    public void sum(int a,int b)
    {
        System.out.println("Sum: "+ (a+b));
    }
    public void sum(int a,int b , int c)
    {
        System.out.println("Sum: "+(a+b+c));
    }
    public void sum(double a,double b)
    {
        System.out.println("Sum: "+(a+b));
    }
}
public class MethodOverloading
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.sum();
        d.sum(5,6);
        d.sum(1,2,3);
        d.sum(1.0,2.6);
    }
}