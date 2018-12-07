import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTests {
    IntegerSet testIntegerSet;

    @Before
    public void setup(){
        testIntegerSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        assertFalse(testIntegerSet.contains(3));
        assertTrue(testIntegerSet.isEmpty());
        assertEquals(testIntegerSet.size(), 0);

        testIntegerSet.insert(3);

        assertTrue(testIntegerSet.contains(3));
        assertFalse(testIntegerSet.isEmpty());
        assertEquals(testIntegerSet.size(), 1);
    }

    @Test
    public void testIntegerAlreadyThere(){
        testIntegerSet.insert(6);
        assertTrue(testIntegerSet.contains(6));
        assertEquals(testIntegerSet.size(),1);

        testIntegerSet.insert(6);
        assertTrue(testIntegerSet.contains(6));
        assertEquals(testIntegerSet.size(),1);
    }
    @Test
    public void testMultipleInsertNotThere(){
        testIntegerSet.insert(6);
        assertTrue(testIntegerSet.contains(6));
        assertEquals(testIntegerSet.size(),1);

        testIntegerSet.insert(7);
        assertTrue(testIntegerSet.contains(7));
        assertEquals(testIntegerSet.size(),2);
    }

}
