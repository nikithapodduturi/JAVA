import java.util.*;
public class PrintDuplicates
{
  public static void main(String []args)
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("\n Enter array size: ");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("\n Enter array elements: ");
    for(int i=0;i<n;i++)
    {
       arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int c=1;
    for(int i=0;i<n;i++)
    {
       if(i==n-1)
       {
         if(c>1)
         {
           System.out.println(arr[i]+" occured "+c+" times. ");
          }
          break;
        }
        else if(arr[i]==arr[i+1])
        {
           c=c+1;
        }
        if(arr[i]!=arr[i+1] && c>1)
        {
          System.out.println(arr[i]+" occured "+c+" times.");
          c=1;
         }
       }
    }
}