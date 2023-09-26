package serializations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author rora
 */
public class MainEmp {
    public static void main(String[] args) {
        var emp = new Emp();
        emp.name = "Blackey Saint";
        emp.address = "Wisconsin";
        
        try {
            var fileOut = new FileOutputStream("");
            var out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in char.txt file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
