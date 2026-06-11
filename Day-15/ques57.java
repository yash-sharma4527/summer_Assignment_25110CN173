public class ques57 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int i = 0;
        int j = arr.length-1;
        int temp;

        while(i<j){
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }

        System.out.println("The reversed array : ");

        for(int val:arr){
            System.out.print(val+" ");
        }
    }    
}
