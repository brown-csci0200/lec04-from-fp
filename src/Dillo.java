package src;
/**
 * Represents a Dillo
 */
public class Dillo extends SizedAnimal implements IAnimal {
//    public int length;
    public boolean isDead;

    public Dillo(int howLong, boolean isD) {
        super(howLong);
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.length > 60) && (this.isDead);
    }

    public boolean isNormalSize() {
        // Old version:  return this.length >= 12 && this.length < 24
        return this.isLenWithin(12, 24); // New version:  uses isLenWithin from SizedAnimal
    }
}
