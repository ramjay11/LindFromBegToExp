package recursion;

/**
 *
 * @author rora
 */
public class Blastoff {
    public static void main(String[] args) {
        System.out.println("The countdown has begun");
        countdown(10);
        System.out.println("blastoff");
    }
    
    public static void countdown(int count) {
        // Base case. Without it, we would have an infinite loop
        if (count == 0) // stop if number goes to 0
            return;
        System.out.println(count + "...");
        countdown(count-1);
    }
}
