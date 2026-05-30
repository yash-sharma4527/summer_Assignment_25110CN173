import java.util.Scanner;

public class Ques12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers : ");

        int num1  = sc.nextInt();
        int num2 = sc.nextInt();

        int lcm = 0;

        int max = Math.max(num1,num2);

        while(true){
            if(max%num1==0 && max%num2==0){
                lcm = max;
                break;
            }
            max++;
        }

        System.out.print("LCM : "+lcm);

        sc.close();
    }
}
