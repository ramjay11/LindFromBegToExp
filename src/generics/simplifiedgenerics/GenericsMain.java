package generics.simplifiedgenerics;

import java.util.ArrayList;

/**
 *
 * @author rora
 */
public class GenericsMain {
 
    // Classes that uses Generic declaration such as ArrayList and many other Collection classes
    public static void main(String[] args) {
        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);
        
        // Simple array
        Olive[] olives = {o1, o2, o3};
        ArrayList<Olive>  olives2 = new ArrayList<>();
        olives2.add(o1);
        olives2.add(o2);
        olives2.add(o3);
        //System.out.println(olives); // datatype and hash value of the object
        System.out.println(olives2);
    }
}
