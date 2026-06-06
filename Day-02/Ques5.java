import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int sum = 0,digit;

        while(num!=0){
            digit = num % 10;
            sum += digit;
            num/=10;
        }

        System.out.println("The sum of all digits : "+sum);

        sc.close();
    }
}
