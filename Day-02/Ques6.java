import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        boolean negative = false;

        if(num<0){
            num = Math.abs(num);
            negative = true;
        }

        int rev = 0 , digit;

        while(num>0){
            digit = num % 10;
            rev = rev*10 + digit;
            num /= 10;
        }

        if(negative == true) System.out.println("The reverse number : " +(-1*rev));
        else System.out.println("The reversed number : "+rev);
        
        sc.close();
    }
}
