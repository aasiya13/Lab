/**
 * Created by E/13/347
 * P.N. Sithara
 */

package Anonymus;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayTest {
    @Test
    public void testAdd() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);

        assertEquals("[5, 2, 6, 3, 4]",ar.toString());
    }

    @Test
    public void testAdd1() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        assertEquals("[5, 2, 4, 3, 4]",ar.toString());
    }

    @Test
    public void testReplace() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        ar.replace(100,0);
        assertEquals("[100, 2, 6, 3, 2, 4]",ar.toString());
    }

    @Test
    public void testGet() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        ar.replace(100,0);
        assertEquals(100,ar.get(0));
    }

    @Test
    public void testRemove() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        ar.remove(1);
        assertEquals("[5, 6, 3, 2, 4]", ar.toString());
    }

    @Test
    public void testIsEmpty() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        assertEquals(false,ar.isEmpty());

        Array ar1= new Array();
        assertEquals(true,ar1.isEmpty());
    }

    @Test
    public void testSize() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        assertEquals(6,ar.size());

    }

    @Test
    public void testContains() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        assertEquals(true,ar.contains(6));

        Array ar1= new Array(5);
        ar1.add(5);
        ar1.add(2);
        ar1.add(6);
        ar1.add(3);
        ar1.add(4);
        ar1.add(2,4);
        assertEquals(false,ar1.contains(-10));
    }

    @Test
    public void testTrimToSize() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        ar.trimToSize(3);
        assertEquals("[5, 2, 6]",ar.toString());
    }

    @Test
    public void testClear() throws Exception {
        Array ar= new Array(5);
        ar.add(5);
        ar.add(2);
        ar.add(6);
        ar.add(3);
        ar.add(4);
        ar.add(2,4);
        ar.clear();
        assertEquals("[]", ar.toString());

    }
}
