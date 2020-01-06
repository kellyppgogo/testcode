package com.hsbc.risk.interview;

import com.hsbc.risk.interview.service.ConvertionService;

import java.util.List;

/**
 * Created by kellypan on 06/01/2020.
 */
public class Converter {

    static ConvertionService convertionService;

    public static void main(String[] args) {
        convertionService = new ConvertionService(99l);
        List conversionResult = convertionService.getMappingResult();
        System.out.println(conversionResult);
    }
}
