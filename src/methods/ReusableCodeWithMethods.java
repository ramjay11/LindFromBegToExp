package methods;

/**
 *
 * @author rora
 */
public class ReusableCodeWithMethods {
    static String[] months = {"Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
    
    public static void main(String[] args) {
        loopIt("Months of the year");
        loopIt("Second run");
        loopIt("Third run");
    }
    
    static void loopIt(String label) {
        System.out.println(label);
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }   
    }
}
