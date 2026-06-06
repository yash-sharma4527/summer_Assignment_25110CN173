import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int rev = 0 , digit ,original=num;

        while(num!=0){
            digit = num%10;
            rev = rev*10 + digit;
            num/=10;
        }

        if(original==rev) System.out.println("The given number is palindrome");
        else System.out.println("The given number is not palindrome");

        sc.close();
    }
}
