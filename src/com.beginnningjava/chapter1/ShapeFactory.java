package com.beginnningjava.chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kitkwok on 16-11-1.
 */
public class ShapeFactory {
    public static final int SHAPE_TYPE_CIRCLE = 1;
    public static final int SHAPE_TYPE_RECTANGLE=2;
    public static final int SHAPE_TYPE_LINE=3;

    private static Map<Integer, String> shapes = new HashMap<Integer, String>();

    
}
