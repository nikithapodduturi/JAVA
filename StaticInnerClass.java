public class StaticInnerClass {
    static class NestedClass
    {
        public void disp()
        {
            System.out.println("Nested Class");
        }
    }
    public static void main(String args[])
    {
        StaticInnerClass.NestedClass n=new StaticInnerClass.NestedClass();
        n.disp();
    }
}
