package src;

public class Zoo {
    public IAnimal animal1;
    public IAnimal animal2;

    public Zoo(IAnimal ani1, IAnimal ani2) {
        this.animal1 = ani1;
        this.animal2 = ani2;
    }

    public boolean healthCheck() {
        return this.animal1.isNormalSize() && this.animal2.isNormalSize();
    }
}
