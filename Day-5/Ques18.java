import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int original = num;

        int sum = 0,digit;

        while(num!=0){
            digit = num % 10;

            int fact = 1;

            while(digit>1){
                fact *= digit;
                digit--;
            }

            sum += fact;

            num/=10;
        }

        if(sum==original) System.out.println("It is a strong number");
        else System.out.println("It is not a strong number");

        sc.close();
    }
}
