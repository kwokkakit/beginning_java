package com.beginnningjava.chapter1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by kitkwok on 16-11-1.
 */
public class Panel {
    public static void main(String[] args) throws Exception {
        new Panel().selectShape();
    }

    public void selectShape() throws Exception {
        System.out.println("Please in shape type: ");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int shapeType = Integer.parseInt(input.readLine());

        Shape shape = ShapeFactory.getShape(shapeType);

        if (shape == null) {
            System.out.println("Share is not exist.");
        } else {
            shape.draw();
        }
    }
}
