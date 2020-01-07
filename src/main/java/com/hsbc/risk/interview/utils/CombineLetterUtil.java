package com.hsbc.risk.interview.utils;


import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kellypan on 06/01/2020.
 */
public class CombineLetterUtil {


    public static void backTrackingToGetCombineResult(List<List<String>> letterList, Stack stack, int index, List combineResult) {
        if (index == letterList.size()) {
            addToResultList(stack, combineResult);
            if (!stack.isEmpty())
                stack.pop();
            return;
        }

        for (String str : letterList.get(index)) {
            stack.push(str);
            backTrackingToGetCombineResult(letterList, stack, index+1, combineResult);
        }
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }


    public static Long[] verifyInput(String str) throws Exception {

        Pattern pattern = Pattern.compile("^[0-9]{1,2}$");

        if (StringUtils.isNotBlank(str)) {
            String[] digits = str.split(" ");
            Long[] inputNumber = new Long[digits.length];
            for (int i=0; i<digits.length; i++) {
                Matcher isNum = pattern.matcher(digits[i]);
                if (!isNum.matches()) {
                    throw new Exception("Please input valid number:[0-99]");
                }
                inputNumber[i] = Long.valueOf(digits[i]);
            }
            return inputNumber;
        }
        throw new Exception("Your input is empty.");
    }

    private static void addToResultList(Stack<String> stack, List resultList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: stack) {
            stringBuilder.append(str);
        }
        if (StringUtils.isNotEmpty(stringBuilder.toString()))
            resultList.add(stringBuilder.toString());
    }
}
