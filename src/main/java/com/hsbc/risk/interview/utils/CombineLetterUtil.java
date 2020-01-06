package com.hsbc.risk.interview.utils;


import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Stack;

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

    private static void addToResultList(Stack<String> stack, List resultList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: stack) {
          stringBuilder.append(str);
       }
       if (StringUtils.isNotEmpty(stringBuilder.toString()))
            resultList.add(stringBuilder.toString());
    }
}
