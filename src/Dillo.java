package src;
/**
 * Represents a Dillo
 */
public class Dillo {
    public int length;
    public boolean isDead;

    public Dillo(int howLong, boolean isD) {
        this.length = howLong;
        this.isDead = isD;
    }

    /**
     * @return true if this Dillo could shelter a human
     */
    public boolean canShelter() {
        return (this.length > 60) && (this.isDead);
    }

    public boolean isNormalSize() {
        return this.length >= 12 && this.length < 24;
    }
}
