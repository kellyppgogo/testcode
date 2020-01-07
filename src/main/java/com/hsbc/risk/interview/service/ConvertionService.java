package com.hsbc.risk.interview.service;

import com.hsbc.risk.interview.factory.DigitBeanFactory;
import com.hsbc.risk.interview.factory.digit.AbstractDigit;
import com.hsbc.risk.interview.utils.CombineLetterUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by kellypan on 06/01/2020.
 */
public class ConvertionService {


    List<List<String>> letterMapList;
    List<AbstractDigit> digitList;

    public ConvertionService(Long... digits) {
        digitList = new ArrayList<AbstractDigit>();
        letterMapList = new ArrayList<List<String>>();

        for (Long digit : digits) {
            try {
                if (digit != 0 && digit != 1) {
                    AbstractDigit instance = DigitBeanFactory.getDigitInstance(digit);
                    digitList.add(instance);
                    if (!instance.getLetterMapping().isEmpty() && instance.getLetterMapping().size() > 0)
                        letterMapList.add(instance.getLetterMapping());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public List getMappingResult() {
        List mappingResult = new ArrayList();
        Stack stack = new Stack();
        CombineLetterUtil.backTrackingToGetCombineResult(letterMapList, stack, 0, mappingResult);
        return mappingResult;
    }



}
