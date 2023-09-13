package src;
/**
 * Represents a Dillo
 */
// "extends" => include the code from...
public class Dillo extends SizedAnimal implements IAnimal {
    //public int length; // Moved to SizedAnimal
    public boolean isDead;

    public Dillo(int howLong, boolean isD) {
        super(howLong); // Calls the constructor of the class we're extending (superclass, parent, ...)
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.length > 60) && (this.isDead);
    }

    public boolean isNormalSize() {
        return this.length >= 12 && this.length <= 24;
    }
}
