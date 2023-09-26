package prepostincrement;

/**
 *
 * @author rora
 */
public class PrePostIncrement1 {
    public static void main(String[] args) {
        int i = 5;
        
        /* same as int i = 5, i = i++
        int temp;
        temp = i;
        i++;
        i = temp;
        */

        i = i++; // 
        //i = i + 1;
        //i+=1; // same as i = i + 1
        //i++;
        // post increment, will first assigning the value then increment
        //int j = i++; 
        // pre increment, will first increment then will assign
        //int j = ++i; 
        //System.out.println(i);
        //System.out.println(j + " : " + i);
        System.out.println(i);
        
    }
}
