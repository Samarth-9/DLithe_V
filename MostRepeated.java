package MostRepeated;
import java.util.Scanner;
public class MostRepeated
{
	public static void printMostRepeatedElements(int[] arr)
    {
        int n = arr.length;
        int maxCount = 1;
        int[] elementFrequency = new int[n];
        boolean[] processed = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            elementFrequency[i] = 1;
            processed[i] = false;
        }
        for (int i = 0; i < n; i++)
        {
            if (!processed[i])
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        elementFrequency[i]++;
                        processed[j] = true;
                    }
                }
                if (elementFrequency[i] > maxCount)
                    maxCount = elementFrequency[i];
            }
        }
        System.out.print("Most repeated element(s): ");
        for (int i = 0; i < n; i++)
            if (elementFrequency[i] == maxCount)
                System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        printMostRepeatedElements(arr);
        sc.close();
    }
}