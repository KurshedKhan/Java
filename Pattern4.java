public class Pattern4 {

    public static void main(String[] args){
        int Staring_Point;
        int Ending_Point = 10;
        int Staring_Point2;
        

        for(Staring_Point = 0 ; Staring_Point < Ending_Point ; Staring_Point++){

            for(Staring_Point2 = 0; Staring_Point2 < (2*Staring_Point+1) ; Staring_Point2++){

                System.out.print("*");

            }

            System.out.print("\n");
        }
    }
}
