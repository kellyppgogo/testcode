package com.hsbc.risk.interview.factory;

import com.hsbc.risk.interview.factory.digit.AbstractDigit;
import com.hsbc.risk.interview.factory.digit.DoubleDigit;
import com.hsbc.risk.interview.factory.digit.SingleDigit;

/**
 * Created by kellypan on 06/01/2020.
 */
public class DigitBeanFactory {

    public static AbstractDigit getDigitInstance(long digit) throws Exception {
        if (digit < 0) {
            throw new Exception("digit should be a positive number");
        }
        if (digit < 10) {
            return new SingleDigit(digit);
        }

        if (digit < 100) {
            return new DoubleDigit(digit);
        }

        throw new Exception(digit + " is out of support range. Support range: [0-99]");
    }
}
