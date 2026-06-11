import java.util.Scanner;

public class Ques59 {

    public static void reverse(int[] arr,int i,int j){
        int temp;

        while(i<j){
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Enter the number of rotation : ");

        int n = sc.nextInt();

        int size = arr.length-1;

        if(n>=(size+1)){
            n = n%(size+1);
        }

        reverse(arr,0,size);
        reverse(arr,0,n-1);
        reverse(arr,n,size);

        System.out.println("The right rotated array to the corresponding value : ");

        for(int val:arr){
            System.out.print(val+" ");
        }

        sc.close();
    }    
}

