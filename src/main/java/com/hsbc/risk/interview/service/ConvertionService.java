package com.hsbc.risk.interview.service;

import com.hsbc.risk.interview.utils.CombineLetterUtil;
import com.hsbc.risk.interview.factory.digit.AbstractDigit;
import com.hsbc.risk.interview.factory.DigitBeanFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by kellypan on 06/01/2020.
 */
public class ConvertionService {

    List<AbstractDigit> digitList = new ArrayList<AbstractDigit>();
    List<List<String>> letterMapList = new ArrayList<List<String>>();

    public ConvertionService(Long... digits) {
        for (Long digit : digits) {
            try {
                if (digit != 0 && digit != 1) {
                    AbstractDigit instance = DigitBeanFactory.getDigitInstance(digit);
                    digitList.add(instance);
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
