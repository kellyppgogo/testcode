package com.hsbc.risk.interview.factory.digit;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kellypan on 06/01/2020.
 */
public class SingleDigit extends AbstractDigit{

    public SingleDigit(long digit) {
        super(digit);
    }

    public List getLetterMapping() {
        if (letterMapping != null) {
            String[] letters = letterMapping.get(digit);
            if (letters != null && letters.length > 0) {
                List letterList = Arrays.asList(letters);
                return letterList;
            }
        }
        return null;
    }
}
