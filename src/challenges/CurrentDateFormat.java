package challenges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author rora
 */
public class CurrentDateFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date dt = new Date();
        System.out.println("Date in MM/dd/yyyy format: " + df.format(dt));

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN);
        System.out.println("France Time: " + df2.format(dt));
    }
}
