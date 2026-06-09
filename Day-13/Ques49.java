import java.util.Scanner;

public class Ques49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");

        int n = sc.nextInt();

        int[] arr = new int[n] ;

        System.out.print("Enter the elements : ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The given array is as :");

        for(int val:arr){
            System.out.print(val+" ");
        }

        sc.close();
    }
}
