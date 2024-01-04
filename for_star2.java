public class for_star2 {
    public static void main(String[] args){
        int i;
        int j;

        System.out.println("Pattern A:");

        for(i = 3; i>0; i--){
            System.out.print("*");
            for(j = 0; j < (i-1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Pattern B:");

        for(i = 0; i < 3; i++){
            System.out.print("*");
            for(j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Pattern C:");

        for(i = 5; i > 0; i--){
            System.out.print("*");
            for(j=1; j<(5); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
