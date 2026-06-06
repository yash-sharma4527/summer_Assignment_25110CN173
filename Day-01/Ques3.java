import java.util.Scanner;

public class Ques3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the positive number : ");

        int num = sc.nextInt();

        int product = 1;

        for(int i=2;i<=num;i++){
            product*=i;
        }

        System.out.printf("The factorial of %d is %d%n",num,product);

        sc.close();
    }
}