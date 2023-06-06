import java.util .*;
class Student{
    int sub1;
    int sub2;
    int sub3;
    Student()
    {
        sub1=95;
        sub2=80;
        sub3=90;
    }
    Student(int sub1,int sub2,int sub3)
    {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    Student(Student x)
    {
        this.sub1=x.sub1;
        this.sub2=x.sub2;
        this.sub3=x.sub3;
    }
    public void display()
    {
        System.out.println("Sub1 marks: "+sub1);
        System.out.println("Sub2 marks: "+sub2);
        System.out.println("Sub3 marks: "+sub3);        
    }
    public int total()
    {
        return sub1+sub2+sub3;
    }
    public int avg()
    {
        return (sub1+sub2+sub3)/3;
    }
}
public class StudentMarks {
    public static void main(String []args)
    {
        System.out.println("The student score: ");
        System.out.println("Student total score and avg using default constructor");
        Student s=new Student();
        s.display();
        System.out.println("The total marks of student: "+s.total());
        System.out.println("The avg is: "+s.avg());
        System.out.println("Student total score and avg using parametrized constructor");
        Student s1=new Student(90,100,98);
        s1.display();
        System.out.println("The total marks of student: "+s1.total());
        System.out.println("The avg is: "+s1.avg());
        System.out.println("Student total score and avg using copy constructor");
        Student s2=new Student(s1);
        s2.display();
        System.out.println("The total marks of student: "+s2.total());
        System.out.println("The avg is: "+s2.avg());
    }
}
