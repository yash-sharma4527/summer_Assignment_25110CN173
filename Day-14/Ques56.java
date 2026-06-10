public class Ques56 {
    public static void main(String[] args) {

        int[] arr = {45, 67, 45, 23, 12, 45, 89, 23, 90, 67};

        System.out.println("Duplicate Elements are :");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
