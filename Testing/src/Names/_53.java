package Names;

public class _53 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = y +2;
            if ( y >4) {
                y = y - 1;
            }


            System.out.println(x + "" + y + "");
            x = x + 1;
        }
    }

}



/* x = x + 1;
   y = y + x;
= 11 34 59*/

/* y = x - y;
= 00 11 21 32 42*/

/*y = y + x;
= 00 11 23 36 410*/

/*while (x < 5) {
        y = y +2;
        if ( y >4) {
        y = y - 1;
= 02 14 25 36 47
 */