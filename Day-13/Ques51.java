public class Ques51{
    public static void main(String[] args) {
        int[] arr = {18,27,7,77,45,1};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest) largest = arr[i];
            if(arr[i]<smallest) smallest = arr[i];
        }

        System.out.println("Largest : "+largest);
        System.out.println("Smallest : "+smallest);
    }
}
