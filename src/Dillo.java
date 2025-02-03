package src;
/**
 * Represents a Dillo
 */
public class Dillo extends SizedAnimal {
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
        return this.isBetween(12, 24);
    }
}
