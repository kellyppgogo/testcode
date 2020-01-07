package com.hsbc.risk.interview;

import com.hsbc.risk.interview.service.ConvertionService;
import com.hsbc.risk.interview.utils.CombineLetterUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by kellypan on 06/01/2020.
 */
public class Converter {

    static ConvertionService convertionService;

    public static void main(String[] args) throws Exception {
        System.out.println("Please input digits string for letter conversion, use blank space between individual digit... ");
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        try {
            inputStr = bufReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        convertionService = new ConvertionService(CombineLetterUtil.verifyInput(inputStr));
        List conversionResult = convertionService.getMappingResult();
        System.out.println(conversionResult);
    }


}
