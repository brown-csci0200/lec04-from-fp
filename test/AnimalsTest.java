package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {

    // example test data
    Dillo babyDillo = new Dillo(5,false);
    Dillo otherDillo = new Dillo(100, true);

    Zoo myZoo = new Zoo(babyDillo, otherDillo);
    Zoo myZoo2 = new Zoo(babyDillo, new Boa("slinky", 50, "lettuce"));

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(2, 1 + 1);
    }
    @Test
    public void testMakeDillo() {
        Assert.assertEquals(5, babyDillo.length);
    }

    @Test
    public void testCanShelter() {

        Assert.assertEquals(false, babyDillo.canShelter());

        // We can also make objects inside test methods
        // these objects live ONLY inside the method in which they're declared
        Dillo medDillo = new Dillo(20, false);
        Assert.assertEquals(false, medDillo.canShelter());
    }

}
