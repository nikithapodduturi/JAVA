import java.util.*;
public class Deletion
{
  public static void main(String []args)
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("\n Enter array size: ");
    n=sc.nextInt();
    int arr[]=new int[n+1];
    System.out.println("\n Enter array elements: ");
    for(int i=0;i<n;i++)
    {
       arr[i]=sc.nextInt();
    }
    System.out.println("Enter index position");
    int pos=sc.nextInt();
    for(int i=0;i<n;i++)
    {
       if(i>=pos)
       {
         arr[pos]=arr[i+1];
         pos++;
        }
     }
     System.out.println("Array after deletion");
     for(int i=0;i<n-1;i++)
     {
       System.out.println(arr[i]);
     }
    }
}