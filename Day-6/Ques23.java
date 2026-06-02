import java.util.Scanner;

public class Ques23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number : ");

        int num = sc.nextInt();

        int count = 0;

        while(num!=0){

            if((num & 1) == 1) count++;

            num = num >> 1;
        }

        System.out.println("The number of set bits : "+count);

        sc.close();
    }
}