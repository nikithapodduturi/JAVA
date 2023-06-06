import java.util.*;
interface DefaultInterfaces
{
    void method1(String str);
    default void log(String str)
    {
        System.out.println("logging:"+str);
    }
    public static boolean isNull(String str)
    {
       System.out.println("\n Interface Null check");
       return str==null?true:" ".equals(str)?true:false;
    }
}
public class DefaultInterfaceDemo implements DefaultInterfaces
{
    @Override
    public void method1(String str)
    {
         System.out.println("Overridden method");
    }
    @Override
    public void log(String str)
    {
       System.out.println("Overridden log:"+str); 
    }
    public static void main(String [] args)
    {
       DefaultInterfaceDemo d=new DefaultInterfaceDemo();
       d.method1("test");
       boolean flag=DefaultInterfaces.isNull("Rams");
        System.out.println("is Null:"+flag);
        d.log("testing");
    }
}