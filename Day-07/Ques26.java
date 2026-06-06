import java.util.Scanner;

public class Ques26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");

        int num = sc.nextInt();

        System.out.println("The fibonacci series upto "+num+" terms :");

        for(int i=0; i<num; i++){
            System.out.print(fibonacci(i)+" ");
        }

        sc.close();
    }

    public static int fibonacci(int n){
        if(n<=1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
