import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;

        int digits = String.valueOf(n).length();

        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;
            sum += Math.pow(digit, digits);

            temp /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}