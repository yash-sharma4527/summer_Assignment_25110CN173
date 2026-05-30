import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        boolean flag = true;

        if(num<2) flag = false;

        else{

            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    flag = false;
                    break;
                }
            }

        }

        if(flag) System.out.println("It is prime number");
        else System.out.println("It is not a prime number");

        sc.close();
    }
}
