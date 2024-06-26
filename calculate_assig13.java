import java.util.Scanner;
public class calculate_assig13 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a mathematical expression: ");
        String expression = s.nextLine();
        int result = calculate(expression);
        System.out.println("Result: " + result);
        s.close();
    }
    static int calculate(String s) {
        int curr = 0;
        int result = 0;
        int sign = 1; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                curr = curr * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * curr;
                curr = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * curr;
                curr = 0;
                sign = -1;
            }
        }
        result += sign * curr;
        return result;
    }
}        



