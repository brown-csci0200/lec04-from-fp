package src;

public class Glyptodon extends Dillo {
    // All Glyptodons are Dillos
    // All Glyptodons are dead :'(
    public Glyptodon(int howLong) {
        super(howLong, true);
    }

    public boolean canShelter() {
        return this.length * this.length >= 300;
    }
}
