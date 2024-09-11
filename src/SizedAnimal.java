package src;

// abstract presents a class from being made with new
// => This is class is JUST for sharing code
public abstract class SizedAnimal {
    // A class to hold shared that's common to Dillo and Boa
    public int length;

    public SizedAnimal(int len) {
        this.length = length;
    }

    public boolean isLenWithin(int low, int high) {
        // Return true if length is between these value
        return this.length >= low && this.length < high;
    }
}
