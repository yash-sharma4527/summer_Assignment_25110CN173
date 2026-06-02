import java.util.Scanner;

public class Ques22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number : ");

        int bin = sc.nextInt();

        int sum = 0;
        int power = 0;
        int digit;

        while(bin!=0){
            digit = bin%10;

            sum+=digit << power;

            bin/=10;

            power++;
        }

        System.out.println("The decimal form of the given number : "+sum);

        sc.close();
    }
}
