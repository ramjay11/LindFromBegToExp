package loops;

/**
 *
 * @author rora
 */
public class CreatingLoopingCodeBlocks {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
        
        // Incrementing loop
        /*
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        */
        
        // print in reverse order
        /*
        for (int i = months.length-1; i >= 0; i--) {
            System.out.println(months[i]);
        }
        */
        
        // For each loop
        /*
        for (String month : months) {
            // no need to track of a counter variable
            System.out.println(month);
        }
        */
        
        // While loop
        /*
        int counter = 0;
        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }
        */
        
        // Do-While Loop
        int counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
            // Condition evaluation is at the end compare to the while loop
        } while (counter < months.length); 
    }
}
