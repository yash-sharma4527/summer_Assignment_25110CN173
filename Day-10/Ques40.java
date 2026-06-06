public class Ques40 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }

            char ch1 = 'A';

            for(int k=1; k<=i; k++){
                System.out.print(ch1);
                ch1++;
            }

            for(int l=63+i; l>=65; l--){
                System.out.print((char)l);
            }

            System.out.println();
        }
    }
    
}
