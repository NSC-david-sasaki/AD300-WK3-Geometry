package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle mCircle;
    @BeforeEach
    void setUp() {
        mCircle = new Circle("mCircle", 1.0);
    }

    @AfterEach
    void tearDown() {
        mCircle = null;
        System.gc();
    }

    @Test
    void calculateArea() {
        assertEquals(3.1416, mCircle.calculateArea(), 0.001);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(6.2832, mCircle.calculatePerimeter(), 0.001);
    }

    @Test
    void getRadius() {
        assertEquals(1.0, mCircle.getRadius(), 0.001);
    }

    @Test
    void setRadius() {
        mCircle.setRadius(2.0);
        assertEquals(2.0, mCircle.getRadius(), 0.001);
    }

    @Test
    void setRadiusNegative() {
        assertThrows(IllegalArgumentException.class, () -> mCircle.setRadius(-1.0));
    }

    @Test
    void setNullArea() {
        assertThrows(IllegalArgumentException.class, () -> {mCircle.setArea(Double.NaN);});
    }

    @Test
    void setAreaOverflow() {
        assertThrows(IllegalArgumentException.class, () -> mCircle.setRadius(Double.POSITIVE_INFINITY));
    }
}