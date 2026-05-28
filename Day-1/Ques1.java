import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int sum = 0;

        for(int i=1;i<=num;i++){
            sum += i;
        }
        
        System.out.println("The sum of first " + num + " natural no is " + sum);

        sc.close();
    }
}
