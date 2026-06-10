import java.util.Scanner;

public class Ques53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {27,45,78,18,11};

        System.out.print("Enter the element : ");

        int n = sc.nextInt();

        boolean isPresent= false;

        for(int val:arr){
            if(val==n){
                isPresent = true;
                break;
            }
        }

        if(isPresent) System.out.println("The given element is present in the array");
        else System.out.println("The given element is not present in the array");

        sc.close();

    }
}
