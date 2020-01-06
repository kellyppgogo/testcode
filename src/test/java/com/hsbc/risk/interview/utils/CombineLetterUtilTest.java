package com.hsbc.risk.interview.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by kellypan on 06/01/2020.
 */
public class CombineLetterUtilTest {

    String[] expectedArray;

    @Before
    public void setUp() {
        expectedArray = new String[] {
                "aad",
                "aae",
                "aaf",
                "abd",
                "abe",
                "abf",
                "acd",
                "ace",
                "acf",
                "bad",
                "bae",
                "baf",
                "bbd",
                "bbe",
                "bbf",
                "bcd",
                "bce",
                "bcf",
                "cad",
                "cae",
                "caf",
                "cbd",
                "cbe",
                "cbf",
                "ccd",
                "cce",
                "ccf"

        };
    }

    @Test
    public void testBackTrackingToGetCombineResult() {
        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List list2 = new ArrayList();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        List list3 = new ArrayList();
        list3.add("d");
        list3.add("e");
        list3.add("f");

        List bigList = new ArrayList();
        bigList.add(list1);
        bigList.add(list2);
        bigList.add(list3);

        Stack stack = new Stack();
        List combinationList = new ArrayList();
        CombineLetterUtil.backTrackingToGetCombineResult(bigList, stack, 0, combinationList);
        System.out.println(combinationList);
        Assert.assertArrayEquals(expectedArray, combinationList.toArray());
    }
}
