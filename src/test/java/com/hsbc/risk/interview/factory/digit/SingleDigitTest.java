package com.hsbc.risk.interview.factory.digit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kellypan on 06/01/2020.
 */
public class SingleDigitTest {

    @Test
    public void testGetLetterMappingFor1(){
        SingleDigit singleDigit = new SingleDigit(1l);
        Assert.assertNull(singleDigit.getLetterMapping());
    }

    @Test
    public void testGetLetterMappingFor0(){
        SingleDigit singleDigit = new SingleDigit(0l);
        Assert.assertNull(singleDigit.getLetterMapping());
    }

    @Test
    public void testGetLetterMappingFor2(){
        SingleDigit singleDigit = new SingleDigit(2l);
        String[] arrayOf2 = new String[] {"a","b","c"};
        Assert.assertArrayEquals(arrayOf2, singleDigit.getLetterMapping().toArray());
    }

}
