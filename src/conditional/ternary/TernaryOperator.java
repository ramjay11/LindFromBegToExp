package conditional.ternary;

/**
 *
 * @author rora
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int n = 4;
        // result is if even(10) for odd(20)
        int result = 0;
        
        // n % 2 == even
        /*
        if (n % 2 == 0) {
            result = 10; 
        } else {
            result = 20;
        }
        */
        // Ternary operator ?:
        // if  true returns 10(even), fales 20 (odd)
        result = n % 2 == 0 ? 10 : 20;
        
        System.out.println(result);
    }
}
