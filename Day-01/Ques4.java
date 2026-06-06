import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int count = 0;

        while(num!=0){
            count++;
            num = num/10;
        }
        
        System.out.println("The number of digits in the given number : "+count);

        sc.close();
    }
}
