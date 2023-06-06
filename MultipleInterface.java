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
class MultiInterfaces implements MyInter1,MyInter2
{
    @Override
    public void disp()
    {
        System.out.println("Disp Method");
    }
    public void show()
    {
        System.out.println("Show Method");
    }
}
public class MultipleInterface {
    public static void main(String []args)
    {
        MultiInterfaces mi = new MultiInterfaces();
        mi.show();
        mi.disp();
        //Interfaces referencing to its implementer class
        MyInter1 m1;
        m1=new MultiInterfaces();
        //m1.show();
        m1.disp();
        MyInter2 m2;
        m2=new MultiInterfaces();
        m2.show();
        //m2.disp();
    } 
}
