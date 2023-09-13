package src;
/**
 * Represents a Boa
 */

// By saying "Boa implements IAnimal", it means we
// can use a Boa wherever we want an IAnimal
public class Boa extends SizedAnimal implements IAnimal {
    public String name;
    //public int length;
    public String eats;

    public Boa(String name, int length, String eats) {
        super(length); // Call SizedAnimal constructor
        this.name = name;
        this.eats = eats;
    }

    public boolean isNormalSize() {
        return this.isLenWithin(30, 60);
        //return this.length >= 30 && this.length <= 60;
    }
}


/*
 * Now have three important kinds of OO constructs:
 * Classes:  things that exist in our world that we
 *           want to use to make objects
 * Interfaces:  "contracts" for how certain objects
 *               should behave
 * Abstract classes:  just exist for sharing code
 *                    between other classes
 * For more info, see the typed notes.
 */