import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number greater than 1 : ");

        int num = sc.nextInt();

        System.out.println("The prime numbers upto "+num+" are :-");

        for(int i=2;i<=num;i++){
            boolean flag = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i+" ");
        }

        sc.close();
    }
}
