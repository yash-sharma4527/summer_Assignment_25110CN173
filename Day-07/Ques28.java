import java.util.Scanner;

public class Ques28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int rev = reverse(num,0);

        System.out.println("Enter the number : "+rev);

        sc.close();

    }

    public static int reverse(int n,int rev){
        if(n==0) return rev;

        return reverse(n/10,rev*10+n%10);
    }
}
