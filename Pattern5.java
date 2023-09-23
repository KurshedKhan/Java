public class Pattern4 {
    public static void main(String[] args) {
        int i,j,k;
        int n = 10;

        for(i = 0; i < n ; i++){

            for(j = 0 ; j < n ; j++){
                System.out.print(" ");
            }
            
            for(k = 0 ; k < (2*i + 1) ; k++ ){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }
}