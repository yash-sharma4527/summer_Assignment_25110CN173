import java.util.Scanner;

public class Ques46 {

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = 0;

        
        int temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
