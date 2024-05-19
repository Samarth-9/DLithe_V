package MovePrimesToFront;
import java.util.Scanner;
public class MovePrimesToFront
{
	public static int[] movePrimesToFront(int[] arr, int n)
    {
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++)
            if (isPrime(arr[i]))
                result[index++] = arr[i];
        for (int i = 0; i < n; i++)
            if (!isPrime(arr[i]))
                result[index++] = arr[i];
        return result;
    }
    public static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] result = movePrimesToFront(arr, n);
        System.out.println("Array after moving primes to front: ");
        for (int i : result)
            System.out.print(i + " ");
        sc.close();
    }
}