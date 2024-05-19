package PrimeCheck;
import java.util.Scanner;
public class PrimeCheck
{
	public static int checkNumber(int num)
    {
        if (!isPrime(num))
            return 0;
        int sumOfDigits = sumDigits(num);
        if (isPrime(sumOfDigits))
            return 1;
        else
            return 0;
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
    public static int sumDigits(int num)
    {
        int sum = 0;
        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Output: " + checkNumber(num));
    }
}
