package src;

public abstract class SizedAnimal implements IAnimal {
    public int length;

    public SizedAnimal(int howLong) {
        this.length = howLong;
    }

    public boolean isLengthBetween(int lowBound, int highBound) {
        return this.length >= lowBound && this.length <= highBound;
    }
}
