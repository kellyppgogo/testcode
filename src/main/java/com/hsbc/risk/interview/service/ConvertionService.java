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

    public ConvertionService(Long... digits) {
        letterMapList = new ArrayList<List<String>>();

        for (Long digit : digits) {
            try {
                if (digit == 0 || digit == 1) {
                    continue;
                }

                AbstractDigit instance = DigitBeanFactory.getDigitInstance(digit);
                List letterMapping = instance.getLetterMapping();
                if (!letterMapping.isEmpty())
                    letterMapList.add(letterMapping);

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
