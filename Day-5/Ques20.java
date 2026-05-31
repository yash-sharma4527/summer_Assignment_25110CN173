import java.util.Scanner;

public class Ques20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        int largestPrime = 1;
        
        for(int i=2; i<=num; i++){
            if(num%i==0){
                boolean isPrime = true;

                for(int j=2; j*j<=i; j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) largestPrime = i;
            }
        }

        System.out.println("The largest prime factor of the given number : "+largestPrime);

        sc.close();

    }
}
