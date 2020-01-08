package Names;

public class _54_PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4 ) {
            System.out.print(" a");
            x = x - 1;

            if ( x < 1) {
                System.out.print(" ");
                x = x - 2 ;
            }
            if (x < 4) {
                System.out.print("noise");
                x = x + 1 ;
            }
            if ( x == 1) {
                System.out.print("annoys");

            }
  //          if (x ){
 //               System.out.print("an");
  //              x = ;
//            }
            System.out.print("oyster");
  //          x = x ;
        }

    }
}
