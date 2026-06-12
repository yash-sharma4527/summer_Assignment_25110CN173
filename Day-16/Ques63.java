public class Ques63 {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 5, 1, 3};
        int target = 8;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
