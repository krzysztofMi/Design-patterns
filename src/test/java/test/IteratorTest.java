package test;

import iterator.Collection;
import iterator.Iterator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {

    @Test
    public void iteratorTest(){
        Integer[] table = {1, 2, 3, 4, 5};
        Collection<Integer> collection = new Collection<>(table);

        assertTrue(collection.getSize() == table.length, "Collection size should be " + table.length);
        Iterator<Integer> it = collection.iterator();
        int i = 1;
        while (it.hasNext()){
            assertTrue(it.next() == i++, "Next element in collection should be " + i);
        }
        assertFalse(it.hasNext(), "Collection have no more elements.");
        final Iterator<Integer> iterator = collection.iterator();
        assertTrue(iterator.next() == 1);
        assertTrue(iterator.hasNext(), "Collection have more elements.");
        assertTrue(iterator.next() == 2);
        assertTrue(iterator.next() == 3);
        assertTrue(iterator.next() == 4);
        assertTrue(iterator.hasNext(), "Collection have more elements.");
        assertTrue(iterator.next() == 5);
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->iterator.next());
        assertFalse(iterator.hasNext(), "Collection have no more elements.");
    }
}
