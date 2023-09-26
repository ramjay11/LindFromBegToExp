package generics.simplifiedgenerics;

/**
 *
 * @author rora
 */
public class Olive {
    public String oliveName;
    public long color = 0x000000;

    public Olive() {}
    
    public Olive(String oliveName) {
        this.oliveName = oliveName;
    }
    
    public Olive(String oliveName, long color) {
        this(oliveName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "name: " + this.oliveName + ": " + "color: " + this.color;

    }
    
    
}
