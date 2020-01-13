
public class Variables {

    private static int integermax = 2147483647;
    private static int integermin = -2147483648;

    private static byte bytemax = 127;
    private static byte bytemin = -128;

    private static short shortmax = 32767;
    private static short shortmin = -32768;

    private static float floatmax = (float) 34028235E38;
    private static float floatmin = (float) 1.4E-45;

    private static double doublemax = 1.7976931348623157E308;
    private static double doublemin = 4.9E-324;

    public static void main(String args[]) {

        System.out.println("Min byte value   = " + Byte.MIN_VALUE);
        System.out.println("Max byte value   = " + Byte.MAX_VALUE);
        System.out.println("Min short value  = " + Short.MIN_VALUE);
        System.out.println("Max short value  = " + Short.MAX_VALUE);
        System.out.println("Min int value    = " + Integer.MIN_VALUE);
        System.out.println("Max int value    = " + Integer.MAX_VALUE);
        System.out.println("Min long value    = " + Long.MIN_VALUE);
        System.out.println("Max long value    = " + Long.MAX_VALUE);
        System.out.println("Min float value  = " + Float.MIN_VALUE);
        System.out.println("Max float value  = " + Float.MAX_VALUE);
        System.out.println("Min double value = " + Double.MIN_VALUE);
        System.out.println("Max double value = " + Double.MAX_VALUE);
    }
}


