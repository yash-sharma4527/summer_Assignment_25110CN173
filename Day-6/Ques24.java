import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and power respectively : ");

        int base = sc.nextInt();

        int power = sc.nextInt();

        int result = 1;

        for(int i=0; i<power; i++){
            result *= base;
        }

        System.out.println("Required answer : "+result);

        sc.close();
    }
}
