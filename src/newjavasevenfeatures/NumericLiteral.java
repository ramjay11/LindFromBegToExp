package newjavasevenfeatures;

import java.text.NumberFormat;

/**
 *
 * @author rora
 */
public class NumericLiteral {
    public static void main(String[] args) {
        // You can use underscore as thousand separator for numeric literals
        int numberOfOlives = 1_000_000_000;
        NumberFormat formatter = NumberFormat.getInstance();
        System.out.println(formatter.format(numberOfOlives));
    }
}
 