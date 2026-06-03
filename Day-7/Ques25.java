import java.util.Scanner;

public class Ques25 {

    public static int factorial(int n){
        if(n<2) return 1;

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int fact = factorial(num);

        System.out.println("Factorial of the given number : "+fact);

        sc.close();
    }

}
