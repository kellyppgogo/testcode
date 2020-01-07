package com.hsbc.risk.interview.utils;

import jdk.nashorn.internal.runtime.regexp.joni.MatcherFactory;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;

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

    @Test
    public void testverifyInput() {
        String inputStr = "1 2 45";
        Long[] expected = new Long[] {1l,2l,45l};
        try {
            Long[] inputLong = CombineLetterUtil.verifyInput(inputStr);
            Assert.assertArrayEquals(expected, inputLong);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testOutOfRangeverifyInput() {
        String inputStr = "-1 2 45";
        try {
            Long[] inputLong = CombineLetterUtil.verifyInput(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertThat(e.getMessage(), Matchers.containsString("Please input valid number:[0-99]"));
        }
    }

    @Test
    public void testOutOfRangeverifyInput2() {
        String inputStr = "100";
        try {
            Long[] inputLong = CombineLetterUtil.verifyInput(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertThat(e.getMessage(), Matchers.containsString("Please input valid number:[0-99]"));
        }
    }

    @Test
    public void testOutOfRangeverifyInput3() {
        String inputStr = "100 2 #$ hel";
        try {
            Long[] inputLong = CombineLetterUtil.verifyInput(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertThat(e.getMessage(), Matchers.containsString("Please input valid number:[0-99]"));
        }
    }

    @Test
    public void testEmptyverifyInput3() {
        String inputStr = "";
        try {
            Long[] inputLong = CombineLetterUtil.verifyInput(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertThat(e.getMessage(), Matchers.containsString("Your input is empty."));
        }
    }
}
