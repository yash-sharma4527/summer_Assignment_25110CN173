import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int original = num;

        int count = 0;

        while(num!=0){ // counting no of digits
            count++;
            num/=10;
        }

        int original2 = original;

        int sum = 0,digit;

        while(original!=0){
            digit = original%10;

            int pow = 1;

            for(int i=0;i<count;i++){
                pow = pow*digit;
            }

            sum += pow;

            original/=10;
        }

        if(sum==original2) System.out.println("It is an armstrong number");
        else System.out.println("It is not an armstrong number");

        sc.close();

    }
}
