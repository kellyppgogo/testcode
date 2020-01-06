package com.hsbc.risk.interview.factory.digit;

import com.hsbc.risk.interview.utils.CombineLetterUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by kellypan on 06/01/2020.
 * To get the letter mapping of number from 10-99
 * e.g. 22 -> [aa, ab, ac, ba, bb, bc, ca, cb, cc]
 */
public class DoubleDigit extends AbstractDigit{

    public DoubleDigit(long digit) {
        super(digit);
    }

    public List getLetterMapping() {
        Stack stack = new Stack();
        List letterMappingList = new ArrayList();
        CombineLetterUtil.backTrackingToGetCombineResult(getLetterList(), stack, 0, letterMappingList);
        return letterMappingList;
    }

    private List getLetterList() {
        List letterList = new ArrayList();

        if (letterMapping.get(digit/10) != null
                && letterMapping.get(digit/10).length > 0)
            letterList.add(Arrays.asList(letterMapping.get(digit/10)));

        if (letterMapping.get(digit % 10) != null
                && letterMapping.get(digit % 10).length > 0)
            letterList.add(Arrays.asList(letterMapping.get(digit % 10)));

        return letterList;
    }
}
