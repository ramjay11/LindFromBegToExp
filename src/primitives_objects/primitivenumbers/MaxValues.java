package primitives_objects.primitivenumbers;

/**
 *
 * @author rora
 */
public class MaxValues {

    public static void main(String[] args) {
        // Helper class
        byte b = 127;
        System.out.println("Byte: " + b);
        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte: " + b);
    }
}
