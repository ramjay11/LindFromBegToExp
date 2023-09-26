package conditional.newswitch;

/**
 *
 * @author rora
 */
public class NewSwitch {
    public static void main(String[] args) {
        //int num = 1;
        
        String day = "Sunday";
        String result = "";
        
        //switch (day) { // switch expression
        // it's now an expression block
        result = switch (day) { // switch expression
            // 2 conditions in a case
//            case "Saturday", "Sunday":
//                System.out.println("Wake up at 11am");
//                break;
//            case "Monday":
//                System.out.println("Wake up at 8am");
//                break;    
//            default:
//                System.out.println("Wake up at 8:30am");
//                throw new AssertionError();
            
            // New switch
            //case "Saturday", "Sunday" -> System.out.println("Wake up at 11am");
            //case "Saturday", "Sunday" -> result = "Wake up at 11am";
            case "Saturday", "Sunday" -> "Wake up at 11am";
            //case "Saturday", "Sunday" : yield "Wake up at 11am"; // use : with yield
            //case "Monday" -> System.out.println("Wake up at 8am"); 
            case "Monday" -> result = "Wake up at 8am"; 
            //default -> System.out.println("Wake up at 8:30am");
            default -> result = "Wake up at 8:30am";
            
        };
        // Switch as an expression
        System.out.println(result);
    }
}
