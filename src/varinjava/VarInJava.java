package varinjava;

import java.util.ArrayList;

/**
 *
 * @author rora
 * Java is always been Type-safe. It is still but now we can use var (Local Variable Type 
 * Inference) beginning Java 10. This works with primitives and class types
 * var can't be a class variable
 * 
 */
public class VarInJava {
    public static void main(String[] args) {
        //int i = 10
        var i = 10;
        System.out.println(i);
        //String str = "Hello";
        var str = "Hello";
        //SimpleRemoteStatelessSessionProxyFactoryBean bean = 
          //      new SimpleRemoteStatelessSessionProxyFactoryBean();
        //var bean = new SimpleRemoteStatelessSessionProxyFactoryBean();
        //ArrayList<String> names = new ArrayList<>();
        // If List<String> names = new ArrayList<>(), var won't work
        var names = new ArrayList<String>();
        
        var firstName = "Blackey";
        var lastName = "Saint";
        var fullName = firstName + " " + lastName;
        var nameToStr = fullName.toString();
        System.out.println(fullName);
        
        // lambda can't allow var
        //var myLambda = () -> System.out.println("Lambda");
        
    }
    
    // int a and int b can't be var
    public int add(int a, int b) {
        return a + b;
    }
    
    
}
