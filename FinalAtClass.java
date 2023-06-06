final class parent
{
    private String name="Levi";
    public String getName()
    {
        return name;
    }
}
public class FinalAtClass {
    public static void main(String []args)
    {
        parent p=new parent();
        System.out.println("Name: "+p.getName());
    }
}
