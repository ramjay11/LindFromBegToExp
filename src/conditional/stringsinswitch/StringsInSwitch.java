package conditional.stringsinswitch;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rora
 */
public class StringsInSwitch {
    
    public static void main(String[] args) {
        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);
        
        ArrayList<Olive> list = new ArrayList<>();
        
        list.add(o1);
        list.add(o2);
        list.add(o3);
        
        var generator = new Random();
        // Will get random value from 0 to 2
        var index = generator.nextInt(3);
        System.out.println("random value: " + index);
        
        //
        Olive o = list.get(index);
        
        switch (o.oliveName) {
            case "Kalamata":
                System.out.println("It's Greek");
                break;
            case "Picholine":
                System.out.println("It's French");
                break;
            case "Ligurio":
                System.out.println("It's Italian");
                break;    
            default:
                System.out.println("I don't know where it's from!");
                throw new AssertionError();
        }
    }
}
