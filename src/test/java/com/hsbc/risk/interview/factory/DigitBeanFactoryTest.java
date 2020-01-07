package com.hsbc.risk.interview.factory;

import com.hsbc.risk.interview.factory.digit.AbstractDigit;
import com.hsbc.risk.interview.factory.digit.DoubleDigit;
import com.hsbc.risk.interview.factory.digit.SingleDigit;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kellypan on 06/01/2020.
 */
public class DigitBeanFactoryTest {

    @Test
    public void testGetSingleDigitInstance() {
        try {
            AbstractDigit digitInstance = DigitBeanFactory.getDigitInstance(3l);
            Assert.assertTrue(digitInstance instanceof SingleDigit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetDoubleDigitInstance() {
        try {
            AbstractDigit digitInstance = DigitBeanFactory.getDigitInstance(13l);
            Assert.assertTrue(digitInstance instanceof DoubleDigit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetDigitInstanceException() {
        try {
            AbstractDigit digitInstance = DigitBeanFactory.getDigitInstance(100l);
        } catch (Exception e) {
            Assert.assertThat(e.getMessage(), Matchers.containsString("100 is out of support range. Support range: [0-99]"));
        }
    }

    @Test
    public void testGetDigitInstanceExceptionOfNegative(){
        try {
            AbstractDigit digitInstance = DigitBeanFactory.getDigitInstance(-2l);
        } catch (Exception e) {
            Assert.assertThat(e.getMessage(), Matchers.containsString("-2 is out of support range. Support range: [0-99]"));
        }
    }
}
