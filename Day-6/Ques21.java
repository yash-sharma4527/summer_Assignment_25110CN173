import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number : ");

        int num = sc.nextInt();

        int power = 0;
        int sum = 0;
        int digit;

        while(num!=0){
            digit = num%2;

            sum+=digit*((int) Math.pow(10,power));

            num/=2;

            power++;
        }

        System.out.println("The binary form of the given number : "+sum);

        sc.close();
    }
}
