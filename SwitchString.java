import java.util.*;
public class SwitchString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter color");
        String s=sc.nextLine();
        switch(s)
        {
            case "Indigo":
                System.out.println("Entered color is Indigo");
                break;
            case "Purple":
                System.out.println("Entered color is Purple");
                break;
            case "Red":
                System.out.println("Entered color is Red");
                break;
            case "Green":
                System.out.println("Entered color is Green");
                break;
            case "Blue":
                System.out.println("Entered color is Blue");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    //sc.close();
}
