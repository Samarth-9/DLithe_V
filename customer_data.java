package customer_data;
import java.util.Scanner;
class Customer
{
    private String name;
    private String city;
    private int id;
    public Customer()
    {
        this.name = "Unknown";
        this.city = "Unknown";
        this.id = 0;
    }
    public Customer(String name, String city, int id)
    {
        this.name = name;
        this.city = city;
        this.id = id;
    }
    public void printCustomerDetails()
    {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer City: " + city);
    }
}
public class customer_data
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        Customer defaultCustomer = new Customer();
        System.out.println("Default Constructor:");
        defaultCustomer.printCustomerDetails();
        System.out.println();
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer City: ");
        String city = sc.nextLine();
        Customer parameterizedCustomer = new Customer(name, city, id);
        System.out.println("Parameterized Constructor:");
        parameterizedCustomer.printCustomerDetails();
        sc.close();
    }
}