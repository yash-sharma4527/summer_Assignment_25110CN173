import java.util.Scanner;

public class Ques16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        System.out.println("The armstrong numbers upto "+num+" are :");

        for(int i=1;i<=num;i++){
            int count = 0;

            int original = i;

            while(original!=0){
                count++;
                original/=10;
            }

            int temp = i;
            int sum = 0,digit;

            while(temp!=0){
                digit = temp%10;

                sum += (int) Math.pow(digit,count);

                temp/=10;
            }

            if(sum==i) System.out.print(sum+" ");
        }

        sc.close();
    }
}
