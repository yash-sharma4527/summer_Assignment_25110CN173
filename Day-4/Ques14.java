import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term of fibonacci series : ");

        int num = sc.nextInt();

        int a = 0 , b = 1 , c;

        for(int i=0;i<num-1;i++){
            c = a+b;
            a = b;
            b = c;
        }

        System.out.println("The "+num+"th term : "+a);

        sc.close();
    }
}
