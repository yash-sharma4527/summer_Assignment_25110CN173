import java.util.Scanner;

public class Ques50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");

        int n = sc.nextInt();

        System.out.print("Enter the no of elements: ");
        
        int[] arr = new int[n];

        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }

        System.out.println("Sum : "+sum);

        System.out.println("Average : "+(float)sum/n);

        sc.close();
    }
}
