package src;

public interface IAnimal {
    // Determine if animal has a normal size for its type
    // All classes that implement IAnimal MUST provide this method
    // If they don't have it, it's an error
    public boolean isNormalSize();
}
