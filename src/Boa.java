package src;
/**
 * Represents a Boa
 */
public class Boa extends SizedAnimal implements IAnimal {
    public String name;
    public String eats;

    public Boa(String name, int length, String eats) {
        super(length); // Call the constructor from SizedAnimal (the "parent" class/superclass)
        this.name = name;
        this.eats = eats;
    }

    public boolean isNormalSize() {
        // Return true if length is between these value
        // Old version:  return this.length >= 30 && this.length < 60;
        // New version uses SizedAnimal
        return this.isLenWithin(30, 60);
    }



}
