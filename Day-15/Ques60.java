public class Ques60 {

    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public static void main(String[] args) {
        int[] arr = {1,0,5,0,0,7,9,0};

        int nextNonZero = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                swap(arr,i,nextNonZero);
                nextNonZero++;
            }
        }
    
        System.out.println("The given array : ");

        for(int val:arr){
            System.out.print(val+" ");
        }
    }    
}
