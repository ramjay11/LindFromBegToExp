package wallbuzz;

/**
 * if multiple of 3, print "Wall"
 * if multiple of 5, print "Buzz"
 * if multiple of both 3 and 5, print "Walleye"
 * 
 * @author rora
 */
public class WallBuzz {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Walleye");
            } else if (i % 3 == 0) {
                System.out.println("Wall");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
