package regexes;

/**
 *
 * @author rora
 */
public class Regex1 {
    public static void main(String[] args) {
        String data = "Apple Microsoft IBM Intel";
        // Extract the data
        String[] companies = data.split(" ");
        for (String str : companies) {
            System.out.println(str);
        }
    }
}
