package com.hsbc.risk.interview.factory.digit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kellypan on 06/01/2020.
 */
public abstract class AbstractDigit {

    Map<Long, String[]> letterMapping;

    long digit;

    public AbstractDigit(long digit) {
        this.digit = digit;

        letterMapping = new HashMap<Long, String[]>();
        letterMapping.put(0L, null);
        letterMapping.put(1L, null);
        letterMapping.put(2L, new String[]{"a","b","c"});
        letterMapping.put(3L, new String[]{"d","e","f"});
        letterMapping.put(4L, new String[]{"g","h","i"});
        letterMapping.put(5L, new String[]{"j","k","l"});
        letterMapping.put(6L, new String[]{"m","n","o"});
        letterMapping.put(7L, new String[]{"p","q","r","s"});
        letterMapping.put(8L, new String[]{"t","u","v"});
        letterMapping.put(9L, new String[]{"w","x","y","z"});
    }

    public abstract List getLetterMapping();
}
