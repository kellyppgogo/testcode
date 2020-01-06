package com.hsbc.risk.interview.factory.digit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kellypan on 06/01/2020.
 */
public class DoubleDigitTest {

    String[] emptyArray = new String[]{};

    @Test
    public void testGetLetterMappingFor10() {
        DoubleDigit doubleDigit = new DoubleDigit(10l);
        Assert.assertArrayEquals(emptyArray, doubleDigit.getLetterMapping().toArray());
    }

    @Test
    public void testGetLetterMappingFor11() {
        DoubleDigit doubleDigit = new DoubleDigit(11l);
        Assert.assertArrayEquals(emptyArray, doubleDigit.getLetterMapping().toArray());
    }

    @Test
    public void testGetLetterMappingFor32() {
        DoubleDigit doubleDigit = new DoubleDigit(32l);
        String[] array32 = new String[] {"da", "db", "dc", "ea", "eb", "ec", "fa", "fb", "fc"};
        Assert.assertArrayEquals(array32, doubleDigit.getLetterMapping().toArray());
    }

    @Test
    public void testGetLetterMappingFor23() {
        DoubleDigit doubleDigit = new DoubleDigit(23l);
        String[] array23 = new String[] {"ad","ae","af","bd","be","bf","cd","ce","cf"};
        Assert.assertArrayEquals(array23, doubleDigit.getLetterMapping().toArray());
    }

    @Test
    public void testGetLetterMappingFor13() {
        DoubleDigit doubleDigit = new DoubleDigit(13l);
        String[] array13 = new String[] {"d","e","f"};
        Assert.assertArrayEquals(array13, doubleDigit.getLetterMapping().toArray());
        doubleDigit = new DoubleDigit(03l);
        Assert.assertArrayEquals(array13, doubleDigit.getLetterMapping().toArray());
    }

}
