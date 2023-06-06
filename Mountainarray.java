import java.util.*;

class Mountainarray{
    public static boolean validMountainarray(int a[]) {
        int n = a.length;
        
        int i = 0;
        int j = n - 1;
        while (i + 1 < n && a[i] < a[i + 1]) {
            i = i + 1;
        }
        while (j > 0 && a[j - 1] > a[j]) {
            j = j - 1;
        }
        return i > 0 && i == j && j < n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean k = validMountainarray(a);
        System.out.println(k);
    }
}