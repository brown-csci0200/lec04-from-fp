package src;
/**
 * Represents a Boa
 */
public class Boa extends SizedAnimal {
    public String name;
    public String eats;

    public Boa(String name, int length, String eats) {
        super(length);
        this.name = name;
        this.eats = eats;
    }

    public boolean isNormalSize() {
        return this.isLengthBetween(30, 60);
    }
}
