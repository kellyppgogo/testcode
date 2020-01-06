package com.hsbc.risk.interview.service;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by kellypan on 06/01/2020.
 */
public class ConversionServiceTest {

    ConvertionService convertionService;

    @Test
    public void testGetMappingResult() {
        convertionService = new ConvertionService(0l,1l,2l,20l,4l,9l);
        List mappingList = convertionService.getMappingResult();
        Assert.assertEquals(108, mappingList.size());
        Assert.assertTrue("list contains cbiw", mappingList.contains("cbiw"));
    }

    @Test
    public void testGetMappingResultOn0() {
        convertionService = new ConvertionService(0l,1l,10l,11l);
        List mappingList = convertionService.getMappingResult();
        Assert.assertEquals(0, mappingList.size());
        Assert.assertTrue("the list is empty", mappingList.isEmpty());
    }
}
