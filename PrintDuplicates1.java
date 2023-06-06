import java.util.*;
public class PrintDuplicates1
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
    System.out.println("\n Array elements are: ");
    for(int i=0;i<n;i++)
    {
       System.out.print(arr[i]+" ");
    }
    System.out.println("\n Duplicate Elements are: ");
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
    {
	int c=1;
      for(int j=i+1;j<n;j++)
      {
       if(arr[i]==arr[j])
       {
          c++;
          i=j;
        }
       }
       if(c>1)
       {
         System.out.println(arr[i]+" Occurred "+c+" times ");
       }
     }
   }
}