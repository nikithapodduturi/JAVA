import java.util.*;
interface MyInter1
{
    int M=10;
    void disp();
}
interface MyInter2
{
    int MAX=100;
    public abstract void show();
}
class MultiInterfaces implements MyInter2
{
    public void disp()
    {
        System.out.println("Disp Method");
    }
    public void show()
    {
        System.out.println("Show Method");
    }
    public void show(int x)
    {
        System.out.println("Show method x value: " +x);
        System.out.println("MAX value: "+MAX);
    } 
}
public class ExtendInterfaces {
    public static void main(String args[])
    {
        MultiInterfaces mi= new MultiInterfaces();
        mi.disp();
        mi.show();
        mi.show(5);
        System.out.println("M value in main method: "+MyInter1.M);
        System.out.println("MAX value in main method: "+MyInter2.MAX);
    }
}
