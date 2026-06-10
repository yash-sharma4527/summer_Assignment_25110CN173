import java.util.Scanner;

public class Ques54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {45,67,45,23,12,45,45,89,23,89,90,67};

        System.out.print("Enter the element to be count : ");

        int n = sc.nextInt();

        int count = 0;

        for(int val : arr){
            if(val==n) count++;
        }

        System.out.println("Frequency : "+count);

        sc.close();
    }
}
