import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms of fibonacci series : ");

        int num = sc.nextInt();

        System.out.println("Fibonacci series upto "+num+" term :");

        int a = 0 , b = 1 , c;

        for(int i = 0; i<num; i++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
