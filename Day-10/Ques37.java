
public class Ques37 {
    public static void main(String[] args) {

        int n = 1;

        for(int i=5; i>=1; i--){

            for(int k=i-1; k>=1; k--){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                System.out.print('*');
            }
            n=n+2;
            System.out.println();
        }
    }    
}
