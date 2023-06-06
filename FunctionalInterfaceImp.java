import java.util.*;
@FunctionalInterface//@FunctionalInterface anf class name shouldnt be same!!
interface MyInterface
{
    public void showCase();

}
class FunctionalInterfaceImp implements MyInterface
{
    public void showCase()
    {
        System.out.println("Showcase implemented");
    }
    public void disp()
    {
        System.out.println("Disp implemented");
    }
    public static void main(String []args)
    {
        FunctionalInterfaceImp m= new FunctionalInterfaceImp();
        m.showCase();
        m.disp();
    }

}
