package javatricks;

import java.util.Arrays;

/**
 *
 * @author rora
 */
public class Masking {
    public static void main(String[] args) {
        String[] masking = {"r", "a", "m", "@", "y", "a", "h", "o", "o", ".", "c", "o", "m"};
        Arrays.fill(masking, 1, 12, "#");
        for (String m : masking) {
            System.out.print(m);
        }
        System.out.println();
    }
}
