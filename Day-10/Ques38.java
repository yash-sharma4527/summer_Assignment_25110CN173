public class Ques38 {
    public static void main(String[] args) {
        int n = 9;

        for(int i=1; i<=5; i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            for(int k=1; k<=n; k++){
                System.out.print('*');
            }

            n = n-2;
            System.out.println();
        }
    }
    
}
