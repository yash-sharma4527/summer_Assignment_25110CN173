import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int product = 1,digit;

        while(num!=0){
            digit = num % 10;
            product*=digit;
            num/=10;
        }

        System.out.println("The product of digits : "+product);

        sc.close();
    }
    
}
