import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers for GCD : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = Math.min(num1 ,num2);

        int gcd = 0;

        for(int i=min;i>=1;i--){
            if(num1%i==0 && num2%i==0){
                gcd = i;
                break;
            }
        }

        System.out.println("The gcd is : " + gcd);

        sc.close();
    }
}
