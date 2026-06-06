import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int sum = sumDigits(num);

        System.out.println("The sum of digits of the given number : "+sum);

        sc.close();
    }

    public static int sumDigits(int n){
        if(n==0) return 0;

        return n%10 + sumDigits(n/10);
    }
}
