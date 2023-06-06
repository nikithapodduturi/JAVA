@FunctionalInterface
interface Age
{
    int AGE=21;
    void getAge();
}

public class AnonymousClassInterface {
    public static void main(String args[])
    {
        Age obj=new Age()
        {
            public void getAge()
            {
                System.out.println("Age is: "+AGE);
            }
        };
        obj.getAge();
    }
}
