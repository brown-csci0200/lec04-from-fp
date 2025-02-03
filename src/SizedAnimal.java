package src;

public abstract class SizedAnimal implements IAnimal {
    public int length;

    public SizedAnimal(int l){
        this.length = l;
    }

    public boolean isBetween(int lowerBound, int upperBound){
        return this.length >= lowerBound &&
                this.length < upperBound;
    }
}
