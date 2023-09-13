package src;

// "abstract" => prevent this class from being made with new
// this class is only for sharing code
public abstract class SizedAnimal {
    // Class to hold code common to Dillo and Boa
    // (animals that have a size)
    public int length;

    public SizedAnimal(int len) {
        this.length = len;
    }

    public boolean isLenWithin(int low, int high) {
        return this.length >= low && this.length <= high;
    }
}
