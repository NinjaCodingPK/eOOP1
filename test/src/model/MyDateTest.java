package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wookie on 5/18/16.
 */
public class MyDateTest {

    @Test
    public void equalsTest() {
        MyDate date1 = new MyDate(1, 2, 3);
        MyDate date2 = new MyDate(1, 2, 3);

        boolean result = date1.equals(date2);
        assertEquals("Should be equal : ", true, result);

        result = date2.equals(date1);
        assertEquals("Should be equal (reverse) : ", true, result);

        date2 = new MyDate(2, 2, 3);
        result = date1.equals(date2);
        assertEquals("Shouldn't be equal : ", false, result);
    }
}